package com.evolution.repository.faturamento.pedido;

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

import com.evolution.model.adm.Almoxarifado_;
import com.evolution.model.cadastro.Cadastro_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.faturamento.PedidoFat;
import com.evolution.model.faturamento.PedidoFat_;
import com.evolution.repository.faturamento.filter.PedidoFilter;
import com.evolution.repository.faturamento.projection.PedidoResumo;

public class PedidoFatRepositoryImpl implements PedidoFatRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<PedidoResumo> resumir(PedidoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<PedidoResumo> criteria = builder.createQuery(PedidoResumo.class);
		Root<PedidoFat> root = criteria.from(PedidoFat.class);

		criteria.select(builder.construct(PedidoResumo.class, 
				root.get(PedidoFat_.id),
				root.get(PedidoFat_.cadastro).get(Cadastro_.empresa).get(Empresa_.id),
				root.get(PedidoFat_.almoxarifado).get(Almoxarifado_.filial).get(Filial_.id), 
				root.get(PedidoFat_.data),
				root.get(PedidoFat_.cadastro).get(Cadastro_.nomeRazao), 
				root.get(PedidoFat_.total),
				root.get(PedidoFat_.situacao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(PedidoFat_.data)));
		orderList.add(builder.asc(root.get(PedidoFat_.id)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<PedidoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, PedidoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(PedidoFilter filter, CriteriaBuilder builder, Root<PedidoFat> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(PedidoFat_.id), filter.getId()));
		}

		if (filter.getSituacao() != null) {
			predicates.add(builder.equal(root.get(PedidoFat_.situacao), filter.getSituacao()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(PedidoFat_.cadastro).get(Cadastro_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(PedidoFat_.almoxarifado).get(Almoxarifado_.filial).get(Filial_.id),
					filter.getFilial()));
		}

		if (!StringUtils.isEmpty(filter.getCliente())) {
			predicates.add(builder.like(builder.lower(root.get(PedidoFat_.cadastro).get(Cadastro_.nomeRazao)),
					"%" + filter.getCliente().toLowerCase() + "%"));
		}

		if (filter.getDataDe() != null) {
			predicates.add(builder.greaterThanOrEqualTo(builder.function("trunc", Date.class, root.get(PedidoFat_.data)),
					filter.getDataDe()));
		}

		if (filter.getDataAte() != null) {
			predicates.add(builder.lessThanOrEqualTo(builder.function("trunc", Date.class, root.get(PedidoFat_.data)),
					filter.getDataAte()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long PedidoResumo(PedidoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<PedidoFat> root = criteria.from(PedidoFat.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<PedidoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
