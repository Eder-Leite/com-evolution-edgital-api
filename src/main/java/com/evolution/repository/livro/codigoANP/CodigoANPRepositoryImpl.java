package com.evolution.repository.livro.codigoANP;

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

import com.evolution.model.livro.CodigoANP;
import com.evolution.model.livro.CodigoANP_;
import com.evolution.repository.livro.filter.CodigoANPFilter;
import com.evolution.repository.livro.projection.CodigoANPResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CodigoANPRepositoryImpl implements CodigoANPRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CodigoANPResumo> resumir(CodigoANPFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CodigoANPResumo> criteria = builder.createQuery(CodigoANPResumo.class);
		Root<CodigoANP> root = criteria.from(CodigoANP.class);

		criteria.select(builder.construct(CodigoANPResumo.class, 
				root.get(CodigoANP_.id), 
				root.get(CodigoANP_.codigo),
				root.get(CodigoANP_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(CodigoANP_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CodigoANPResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CodigoANPResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(CodigoANPFilter filter, CriteriaBuilder builder, Root<CodigoANP> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(CodigoANP_.id), filter.getId()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.like(builder.lower(root.get(CodigoANP_.codigo)),
					"%" + filter.getCodigo().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CodigoANPResumo(CodigoANPFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CodigoANP> root = criteria.from(CodigoANP.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CodigoANPResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
