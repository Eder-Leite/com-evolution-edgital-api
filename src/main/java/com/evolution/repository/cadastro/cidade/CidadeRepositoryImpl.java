package com.evolution.repository.cadastro.cidade;

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

import com.evolution.model.cadastro.Cidade;
import com.evolution.model.cadastro.Cidade_;
import com.evolution.model.cadastro.Estado_;
import com.evolution.model.cadastro.Pais_;
import com.evolution.repository.cadastro.filter.CidadeFilter;
import com.evolution.repository.cadastro.projection.CidadeResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CidadeRepositoryImpl implements CidadeRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CidadeResumo> resumir(CidadeFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CidadeResumo> criteria = builder.createQuery(CidadeResumo.class);
		Root<Cidade> root = criteria.from(Cidade.class);

		criteria.select(
				builder.construct(CidadeResumo.class, 
						root.get(Cidade_.id), 
						root.get(Cidade_.estado).get(Estado_.pais).get(Pais_.id),
						root.get(Cidade_.estado).get(Estado_.pais).get(Pais_.nome),
						root.get(Cidade_.estado).get(Estado_.id), 
						root.get(Cidade_.estado).get(Estado_.nome), 
						root.get(Cidade_.estado).get(Estado_.sigla), 
						root.get(Cidade_.nome), 
						root.get(Cidade_.codigo)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Cidade_.nome)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CidadeResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CidadeResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(CidadeFilter filter, CriteriaBuilder builder, Root<Cidade> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Cidade_.id), filter.getId()));
		}

		if (filter.getEstado() != null) {
			predicates.add(builder.equal(root.get(Cidade_.estado).get(Estado_.id), filter.getEstado()));
		}
		
		if (!StringUtils.isEmpty(filter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get(Cidade_.nome)),
					"%" + filter.getNome().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CidadeResumo(CidadeFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Cidade> root = criteria.from(Cidade.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CidadeResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
