package com.evolution.repository.adm.almoxarifado;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.util.StringUtils;

import com.evolution.model.adm.Almoxarifado;
import com.evolution.model.adm.Almoxarifado_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Filial_;
import com.evolution.repository.adm.filter.AlmoxarifadoFilter;
import com.evolution.repository.adm.projection.AlmoxarifadoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class AlmoxarifadoRepositoryImpl implements AlmoxarifadoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<AlmoxarifadoResumo> resumir(AlmoxarifadoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<AlmoxarifadoResumo> criteria = builder.createQuery(AlmoxarifadoResumo.class);
		Root<Almoxarifado> root = criteria.from(Almoxarifado.class);

		criteria.select(builder.construct(AlmoxarifadoResumo.class, 
				root.get(Almoxarifado_.id),
				root.get(Almoxarifado_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(Almoxarifado_.filial).get(Filial_.empresa).get(Empresa_.nome),
				root.get(Almoxarifado_.filial).get(Filial_.id),
				root.get(Almoxarifado_.filial).get(Filial_.nome),
				root.get(Almoxarifado_.codigo), 
				root.get(Almoxarifado_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Almoxarifado_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<AlmoxarifadoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, AlmoxarifadoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(AlmoxarifadoFilter filter, CriteriaBuilder builder,
			Root<Almoxarifado> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Almoxarifado_.id), filter.getId()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(Almoxarifado_.filial).get(Filial_.id), filter.getFilial()));
		}
		
		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(Almoxarifado_.codigo), filter.getCodigo()));
		}
		
		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Almoxarifado_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long AlmoxarifadoResumo(AlmoxarifadoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Almoxarifado> root = criteria.from(Almoxarifado.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<AlmoxarifadoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
