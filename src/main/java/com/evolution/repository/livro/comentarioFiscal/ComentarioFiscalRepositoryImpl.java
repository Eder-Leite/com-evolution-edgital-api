package com.evolution.repository.livro.comentarioFiscal;

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

import com.evolution.model.livro.ComentarioFiscal;
import com.evolution.model.livro.ComentarioFiscal_;
import com.evolution.repository.livro.filter.ComentarioFiscalFilter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class ComentarioFiscalRepositoryImpl implements ComentarioFiscalRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<ComentarioFiscal> resumir(ComentarioFiscalFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ComentarioFiscal> criteria = builder.createQuery(ComentarioFiscal.class);
		Root<ComentarioFiscal> root = criteria.from(ComentarioFiscal.class);

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(ComentarioFiscal_.id)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<ComentarioFiscal> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, ComentarioFiscal(filter));
	}

	private Predicate[] criarRestricoesResumo(ComentarioFiscalFilter filter, CriteriaBuilder builder,
			Root<ComentarioFiscal> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(ComentarioFiscal_.id), filter.getId()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(ComentarioFiscal_.status), filter.getStatus()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao1())) {
			predicates.add(builder.like(builder.lower(root.get(ComentarioFiscal_.descricao1)),
					"%" + filter.getDescricao1().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long ComentarioFiscal(ComentarioFiscalFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<ComentarioFiscal> root = criteria.from(ComentarioFiscal.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<ComentarioFiscal> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
