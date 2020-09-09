package com.evolution.repository.tesouraria.localFaturamento;

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

import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.tesouraria.Conta_;
import com.evolution.model.tesouraria.LocalFaturamento;
import com.evolution.model.tesouraria.LocalFaturamento_;
import com.evolution.repository.tesouraria.filter.LocalFaturamentoFilter;
import com.evolution.repository.tesouraria.projection.LocalFaturamentoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class LocalFaturamentoRepositoryImpl implements LocalFaturamentoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<LocalFaturamentoResumo> resumir(LocalFaturamentoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<LocalFaturamentoResumo> criteria = builder.createQuery(LocalFaturamentoResumo.class);
		Root<LocalFaturamento> root = criteria.from(LocalFaturamento.class);

		criteria.select(builder.construct(LocalFaturamentoResumo.class, 
				root.get(LocalFaturamento_.id),
				root.get(LocalFaturamento_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(LocalFaturamento_.filial).get(Filial_.id), 
				root.get(LocalFaturamento_.filial).get(Filial_.nome), 
				root.get(LocalFaturamento_.conta).get(Conta_.id), 
				root.get(LocalFaturamento_.conta).get(Conta_.descricao), 
				root.get(LocalFaturamento_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(LocalFaturamento_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<LocalFaturamentoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, LocalFaturamentoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(LocalFaturamentoFilter filter, CriteriaBuilder builder,
			Root<LocalFaturamento> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(LocalFaturamento_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(LocalFaturamento_.filial).get(Filial_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(LocalFaturamento_.filial).get(Filial_.id), filter.getFilial()));
		}
		
		if (!StringUtils.isEmpty(filter.getNomeFilial())) {
			predicates.add(builder.like(builder.lower(root.get(LocalFaturamento_.filial).get(Filial_.nome)),
					"%" + filter.getNomeFilial().toLowerCase() + "%"));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(LocalFaturamento_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long LocalFaturamentoResumo(LocalFaturamentoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<LocalFaturamento> root = criteria.from(LocalFaturamento.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<LocalFaturamentoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
