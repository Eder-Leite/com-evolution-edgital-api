package com.evolution.repository.livro.aliquotaNCM;

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

import com.evolution.model.livro.AliquotaNCM;
import com.evolution.model.livro.AliquotaNCM_;
import com.evolution.repository.livro.filter.AliquotaNCMFilter;
import com.evolution.repository.livro.projection.AliquotaNCMResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class AliquotaNCMRepositoryImpl implements AliquotaNCMRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<AliquotaNCMResumo> resumir(AliquotaNCMFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<AliquotaNCMResumo> criteria = builder.createQuery(AliquotaNCMResumo.class);
		Root<AliquotaNCM> root = criteria.from(AliquotaNCM.class);

		criteria.select(builder.construct(AliquotaNCMResumo.class, 
				root.get(AliquotaNCM_.id),
				root.get(AliquotaNCM_.codigo), 
				root.get(AliquotaNCM_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(AliquotaNCM_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<AliquotaNCMResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, AliquotaNCMResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(AliquotaNCMFilter filter, CriteriaBuilder builder,
			Root<AliquotaNCM> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(AliquotaNCM_.id), filter.getId()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.like(builder.lower(root.get(AliquotaNCM_.codigo)),
					"%" + filter.getCodigo().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long AliquotaNCMResumo(AliquotaNCMFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<AliquotaNCM> root = criteria.from(AliquotaNCM.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<AliquotaNCMResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
