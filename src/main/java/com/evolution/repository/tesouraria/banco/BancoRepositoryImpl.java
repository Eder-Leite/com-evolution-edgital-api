package com.evolution.repository.tesouraria.banco;

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

import com.evolution.model.tesouraria.Banco;
import com.evolution.model.tesouraria.Banco_;
import com.evolution.repository.tesouraria.filter.BancoFilter;
import com.evolution.repository.tesouraria.projection.BancoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class BancoRepositoryImpl implements BancoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<BancoResumo> resumir(BancoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<BancoResumo> criteria = builder.createQuery(BancoResumo.class);
		Root<Banco> root = criteria.from(Banco.class);

		criteria.select(builder.construct(BancoResumo.class, 
				root.get(Banco_.id),
				root.get(Banco_.codigo), 
				root.get(Banco_.descricao), 
				root.get(Banco_.tipo),
				root.get(Banco_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Banco_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<BancoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, BancoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(BancoFilter filter, CriteriaBuilder builder, Root<Banco> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Banco_.id), filter.getId()));
		}
		
		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Banco_.status), filter.getStatus()));
		}
		
		if (filter.getTipo() != null) {
			predicates.add(builder.equal(root.get(Banco_.tipo), filter.getTipo()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(Banco_.codigo), filter.getCodigo()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Banco_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long BancoResumo(BancoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Banco> root = criteria.from(Banco.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<BancoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
