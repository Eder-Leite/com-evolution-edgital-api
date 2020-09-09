package com.evolution.repository.tesouraria.movimento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.tesouraria.Agencia_;
import com.evolution.model.tesouraria.Banco_;
import com.evolution.model.tesouraria.Conta_;
import com.evolution.model.tesouraria.HistoricoBancario_;
import com.evolution.model.tesouraria.MovimentoTes;
import com.evolution.model.tesouraria.MovimentoTes_;
import com.evolution.repository.tesouraria.filter.MovimentoFilter;
import com.evolution.repository.tesouraria.projection.MovimentoResumo;

public class MovimentoTesRepositoryImpl implements MovimentoTesRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<MovimentoResumo> resumir(MovimentoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<MovimentoResumo> criteria = builder.createQuery(MovimentoResumo.class);
		Root<MovimentoTes> root = criteria.from(MovimentoTes.class);

		criteria.select(builder.construct(MovimentoResumo.class, root.get(MovimentoTes_.id),
				root.get(MovimentoTes_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(MovimentoTes_.filial).get(Filial_.id),
				root.get(MovimentoTes_.historicoBancario).get(HistoricoBancario_.descricao), root.get(MovimentoTes_.data),
				root.get(MovimentoTes_.conta).get(Conta_.agencia).get(Agencia_.banco).get(Banco_.id),
				root.get(MovimentoTes_.conta).get(Conta_.agencia).get(Agencia_.id),
				root.get(MovimentoTes_.conta).get(Conta_.descricao), root.get(MovimentoTes_.documento),
				root.get(MovimentoTes_.descricao), root.get(MovimentoTes_.valor), root.get(MovimentoTes_.conciliado),
				root.get(MovimentoTes_.tipoMovimento)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(MovimentoTes_.data)));
		orderList.add(builder.asc(root.get(MovimentoTes_.tipoMovimento)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<MovimentoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, MovimentoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(MovimentoFilter filter, CriteriaBuilder builder, Root<MovimentoTes> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(MovimentoTes_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(MovimentoTes_.filial).get(Filial_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(MovimentoTes_.filial).get(Filial_.id), filter.getFilial()));
		}

		if (filter.getDataDe() != null) {
			predicates.add(builder.greaterThanOrEqualTo(
					builder.function("trunc", Date.class, root.get(MovimentoTes_.data)), filter.getDataDe()));
		}

		if (filter.getDataAte() != null) {
			predicates.add(builder.lessThanOrEqualTo(builder.function("trunc", Date.class, root.get(MovimentoTes_.data)),
					filter.getDataAte()));
		}

		if (!StringUtils.isEmpty(filter.getConta())) {
			predicates.add(builder.like(builder.lower(root.get(MovimentoTes_.conta).get(Conta_.descricao)),
					"%" + filter.getConta().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long MovimentoResumo(MovimentoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<MovimentoTes> root = criteria.from(MovimentoTes.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<MovimentoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
