package com.evolution.repository.adm.operacaoEstoque;

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

import com.evolution.model.adm.OperacaoEstoque;
import com.evolution.model.adm.OperacaoEstoque_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.repository.adm.filter.OperacaoEstoqueFilter;
import com.evolution.repository.adm.projection.OperacaoEstoqueResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class OperacaoEstoqueRepositoryImpl implements OperacaoEstoqueRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<OperacaoEstoqueResumo> resumir(OperacaoEstoqueFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<OperacaoEstoqueResumo> criteria = builder.createQuery(OperacaoEstoqueResumo.class);
		Root<OperacaoEstoque> root = criteria.from(OperacaoEstoque.class);

		criteria.select(builder.construct(OperacaoEstoqueResumo.class,
				root.get(OperacaoEstoque_.id),
				root.get(OperacaoEstoque_.empresa).get(Empresa_.id),
				root.get(OperacaoEstoque_.descricao),
				root.get(OperacaoEstoque_.tipo), 
				root.get(OperacaoEstoque_.movimentaEstoque),
				root.get(OperacaoEstoque_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(OperacaoEstoque_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<OperacaoEstoqueResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, OperacaoEstoqueResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(OperacaoEstoqueFilter filter, CriteriaBuilder builder,
			Root<OperacaoEstoque> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(OperacaoEstoque_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(OperacaoEstoque_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}
		
		
		if (filter.getMovimentaEstoque() != null) {
			predicates.add(builder.equal(root.get(OperacaoEstoque_.movimentaEstoque), filter.getMovimentaEstoque()));
		}
		
		if (filter.getTipo() != null) {
			predicates.add(builder.equal(root.get(OperacaoEstoque_.tipo), filter.getTipo()));
		}
		
		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(OperacaoEstoque_.status), filter.getStatus()));
		}
		
		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(OperacaoEstoque_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long OperacaoEstoqueResumo(OperacaoEstoqueFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<OperacaoEstoque> root = criteria.from(OperacaoEstoque.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<OperacaoEstoqueResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
