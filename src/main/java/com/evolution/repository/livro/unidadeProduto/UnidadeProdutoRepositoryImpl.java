package com.evolution.repository.livro.unidadeProduto;

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

import com.evolution.model.livro.UnidadeProduto;
import com.evolution.model.livro.UnidadeProduto_;
import com.evolution.repository.livro.filter.UnidadeProdutoFilter;
import com.evolution.repository.livro.projection.UnidadeProdutoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class UnidadeProdutoRepositoryImpl implements UnidadeProdutoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<UnidadeProdutoResumo> resumir(UnidadeProdutoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<UnidadeProdutoResumo> criteria = builder.createQuery(UnidadeProdutoResumo.class);
		Root<UnidadeProduto> root = criteria.from(UnidadeProduto.class);

		criteria.select(builder.construct(UnidadeProdutoResumo.class, 
				root.get(UnidadeProduto_.id),
				root.get(UnidadeProduto_.descricao), 
				root.get(UnidadeProduto_.sigla)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(UnidadeProduto_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<UnidadeProdutoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, UnidadeProdutoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(UnidadeProdutoFilter filter, CriteriaBuilder builder,
			Root<UnidadeProduto> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(UnidadeProduto_.id), filter.getId()));
		}

		if (!StringUtils.isEmpty(filter.getSigla())) {
			predicates.add(builder.equal(root.get(UnidadeProduto_.sigla), filter.getSigla()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(UnidadeProduto_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long UnidadeProdutoResumo(UnidadeProdutoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<UnidadeProduto> root = criteria.from(UnidadeProduto.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<UnidadeProdutoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
