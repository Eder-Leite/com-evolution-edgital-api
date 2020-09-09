package com.evolution.repository.livro.codigoCFOP;

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

import com.evolution.model.livro.CodigoCFOP;
import com.evolution.model.livro.CodigoCFOP_;
import com.evolution.repository.livro.filter.CodigoCFOPFilter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CodigoCFOPRepositoryImpl implements CodigoCFOPRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CodigoCFOP> resumir(CodigoCFOPFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CodigoCFOP> criteria = builder.createQuery(CodigoCFOP.class);
		Root<CodigoCFOP> root = criteria.from(CodigoCFOP.class);

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(CodigoCFOP_.tipo)));
		orderList.add(builder.asc(root.get(CodigoCFOP_.codigo)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CodigoCFOP> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CodigoCFOP(filter));
	}

	private Predicate[] criarRestricoesResumo(CodigoCFOPFilter filter, CriteriaBuilder builder, Root<CodigoCFOP> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(CodigoCFOP_.id), filter.getId()));
		}

		if (filter.getTipo() != null) {
			predicates.add(builder.equal(root.get(CodigoCFOP_.tipo), filter.getTipo()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(CodigoCFOP_.codigo), filter.getCodigo()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CodigoCFOP(CodigoCFOPFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CodigoCFOP> root = criteria.from(CodigoCFOP.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CodigoCFOP> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
