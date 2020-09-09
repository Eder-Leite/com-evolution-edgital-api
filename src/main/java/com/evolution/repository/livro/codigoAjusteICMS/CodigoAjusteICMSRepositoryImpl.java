package com.evolution.repository.livro.codigoAjusteICMS;

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

import com.evolution.model.livro.CodigoAjusteICMS;
import com.evolution.model.livro.CodigoAjusteICMS_;
import com.evolution.repository.livro.filter.CodigoAjusteICMSFilter;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CodigoAjusteICMSRepositoryImpl implements CodigoAjusteICMSRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CodigoAjusteICMS> resumir(CodigoAjusteICMSFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CodigoAjusteICMS> criteria = builder.createQuery(CodigoAjusteICMS.class);
		Root<CodigoAjusteICMS> root = criteria.from(CodigoAjusteICMS.class);

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(CodigoAjusteICMS_.codigo)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CodigoAjusteICMS> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CodigoAjusteICMS(filter));
	}

	private Predicate[] criarRestricoesResumo(CodigoAjusteICMSFilter filter, CriteriaBuilder builder,
			Root<CodigoAjusteICMS> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(CodigoAjusteICMS_.id), filter.getId()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.like(builder.lower(root.get(CodigoAjusteICMS_.codigo)),
					"%" + filter.getCodigo().toLowerCase() + "%"));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(CodigoAjusteICMS_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CodigoAjusteICMS(CodigoAjusteICMSFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CodigoAjusteICMS> root = criteria.from(CodigoAjusteICMS.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CodigoAjusteICMS> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
