package com.evolution.repository.tesouraria.baixa;

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

import com.evolution.model.cadastro.Cadastro_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.tesouraria.Baixa;
import com.evolution.model.tesouraria.Baixa_;
import com.evolution.repository.tesouraria.filter.BaixaFilter;
import com.evolution.repository.tesouraria.projection.BaixaResumo;


public class BaixaRepositoryImpl implements BaixaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<BaixaResumo> resumir(BaixaFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<BaixaResumo> criteria = builder.createQuery(BaixaResumo.class);
		Root<Baixa> root = criteria.from(Baixa.class);

		criteria.select(builder.construct(BaixaResumo.class, 
				root.get(Baixa_.id),
				root.get(Baixa_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(Baixa_.filial).get(Filial_.id),
				root.get(Baixa_.data),
				root.get(Baixa_.cadastro).get(Cadastro_.nomeRazao), 
				root.get(Baixa_.valorDebitos), 
				root.get(Baixa_.valorCreditos),
				root.get(Baixa_.totalBaixa),
				root.get(Baixa_.situacao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Baixa_.data)));
		orderList.add(builder.asc(root.get(Baixa_.cadastro).get(Cadastro_.nomeRazao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<BaixaResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, BaixaResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(BaixaFilter filter, CriteriaBuilder builder, Root<Baixa> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Baixa_.id), filter.getId()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(Baixa_.filial).get(Filial_.id), filter.getFilial()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Baixa_.cadastro).get(Cadastro_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (!StringUtils.isEmpty(filter.getCliente())) {
			predicates.add(builder.like(builder.lower(root.get(Baixa_.cadastro).get(Cadastro_.nomeRazao)),
					"%" + filter.getCliente().toLowerCase() + "%"));
		}

		if (filter.getDataDe() != null) {
			predicates.add(builder.greaterThanOrEqualTo(builder.function("trunc", Date.class, root.get(Baixa_.data)),
					filter.getDataDe()));
		}

		if (filter.getDataAte() != null) {
			predicates.add(builder.lessThanOrEqualTo(builder.function("trunc", Date.class, root.get(Baixa_.data)),
					filter.getDataAte()));
		}
		
		if (filter.getSituacao() != null) {
			predicates.add(builder.equal(root.get(Baixa_.situacao), filter.getSituacao()));
		}


		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long BaixaResumo(BaixaFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Baixa> root = criteria.from(Baixa.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<BaixaResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
