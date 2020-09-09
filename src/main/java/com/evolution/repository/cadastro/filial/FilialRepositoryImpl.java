package com.evolution.repository.cadastro.filial;

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

import com.evolution.model.cadastro.Filial;
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.cadastro.Cadastro_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.repository.cadastro.filter.FilialFilter;
import com.evolution.repository.cadastro.projection.FilialResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class FilialRepositoryImpl implements FilialRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<FilialResumo> resumir(FilialFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<FilialResumo> criteria = builder.createQuery(FilialResumo.class);
		Root<Filial> root = criteria.from(Filial.class);

		criteria.select(
				builder.construct(FilialResumo.class, 
						root.get(Filial_.id), 
						root.get(Filial_.empresa).get(Empresa_.id),
						root.get(Filial_.empresa).get(Empresa_.nome),
						root.get(Filial_.codigo), 
						root.get(Filial_.nome), 
						root.get(Filial_.cadastro).get(Cadastro_.id), 
						root.get(Filial_.cadastro).get(Cadastro_.nomeRazao), 
						root.get(Filial_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Filial_.nome)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<FilialResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, FilialResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(FilialFilter filter, CriteriaBuilder builder, Root<Filial> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Filial_.id), filter.getId()));
		}
		
		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Filial_.status), filter.getStatus()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Filial_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}
		
		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(Filial_.codigo), filter.getCodigo()));
		}
		
		
		if (!StringUtils.isEmpty(filter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get(Filial_.nome)),
					"%" + filter.getNome().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long FilialResumo(FilialFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Filial> root = criteria.from(Filial.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<FilialResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
