package com.evolution.repository.livro.codigoCEST;

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

import com.evolution.model.livro.CodigoCEST;
import com.evolution.model.livro.CodigoCEST_;
import com.evolution.repository.livro.filter.CodigoCESTFilter;
import com.evolution.repository.livro.projection.CodigoCESTResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CodigoCESTRepositoryImpl implements CodigoCESTRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CodigoCESTResumo> resumir(CodigoCESTFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CodigoCESTResumo> criteria = builder.createQuery(CodigoCESTResumo.class);
		Root<CodigoCEST> root = criteria.from(CodigoCEST.class);

		criteria.select(builder.construct(CodigoCESTResumo.class, 
				root.get(CodigoCEST_.id),
				root.get(CodigoCEST_.codigo), 
				root.get(CodigoCEST_.codigoNCM), 
				root.get(CodigoCEST_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(CodigoCEST_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CodigoCESTResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CodigoCESTResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(CodigoCESTFilter filter, CriteriaBuilder builder, Root<CodigoCEST> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(CodigoCEST_.id), filter.getId()));
		}

		if (!StringUtils.isEmpty(filter.getCodigoNCM())) {
			predicates.add(builder.equal(root.get(CodigoCEST_.codigoNCM), filter.getCodigoNCM()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.like(builder.lower(root.get(CodigoCEST_.codigo)),
					"%" + filter.getCodigo().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CodigoCESTResumo(CodigoCESTFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CodigoCEST> root = criteria.from(CodigoCEST.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CodigoCESTResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
