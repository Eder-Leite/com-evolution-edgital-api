package com.evolution.repository.cadastro.estado;

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

import com.evolution.model.cadastro.Estado;
import com.evolution.model.cadastro.Estado_;
import com.evolution.model.cadastro.Pais_;
import com.evolution.repository.cadastro.filter.EstadoFilter;
import com.evolution.repository.cadastro.projection.EstadoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class EstadoRepositoryImpl implements EstadoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<EstadoResumo> resumir(EstadoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<EstadoResumo> criteria = builder.createQuery(EstadoResumo.class);
		Root<Estado> root = criteria.from(Estado.class);

		criteria.select(
				builder.construct(EstadoResumo.class, 
						root.get(Estado_.id), 
						root.get(Estado_.pais).get(Pais_.id),
						root.get(Estado_.pais).get(Pais_.nome), 
						root.get(Estado_.nome), 
						root.get(Estado_.sigla)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Estado_.nome)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<EstadoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, EstadoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(EstadoFilter filter, CriteriaBuilder builder, Root<Estado> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Estado_.id), filter.getId()));
		}

		if (filter.getPais() != null) {
			predicates.add(builder.equal(root.get(Estado_.pais).get(Pais_.id), filter.getPais()));
		}
		
		if (!StringUtils.isEmpty(filter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get(Estado_.nome)),
					"%" + filter.getNome().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long EstadoResumo(EstadoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Estado> root = criteria.from(Estado.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<EstadoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
