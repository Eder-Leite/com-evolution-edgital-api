package com.evolution.repository.tesouraria.talaoCheque;

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

import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.tesouraria.Agencia_;
import com.evolution.model.tesouraria.Banco_;
import com.evolution.model.tesouraria.TalaoCheque;
import com.evolution.model.tesouraria.TalaoCheque_;
import com.evolution.model.tesouraria.Conta_;
import com.evolution.repository.tesouraria.filter.TalaoChequeFilter;
import com.evolution.repository.tesouraria.projection.TalaoChequeResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class TalaoChequeRepositoryImpl implements TalaoChequeRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<TalaoChequeResumo> resumir(TalaoChequeFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<TalaoChequeResumo> criteria = builder.createQuery(TalaoChequeResumo.class);
		Root<TalaoCheque> root = criteria.from(TalaoCheque.class);

		criteria.select(builder.construct(TalaoChequeResumo.class, 
				root.get(TalaoCheque_.id),
				root.get(TalaoCheque_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(TalaoCheque_.filial).get(Filial_.id), 
				root.get(TalaoCheque_.filial).get(Filial_.nome),
				root.get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.banco).get(Banco_.id),
				root.get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.banco).get(Banco_.descricao),
				root.get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.id),
				root.get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.descricao),
				root.get(TalaoCheque_.conta).get(Conta_.id), 
				root.get(TalaoCheque_.conta).get(Conta_.descricao),
				root.get(TalaoCheque_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(TalaoCheque_.id)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<TalaoChequeResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, TalaoChequeResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(TalaoChequeFilter filter, CriteriaBuilder builder,
			Root<TalaoCheque> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(TalaoCheque_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(TalaoCheque_.filial).get(Filial_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getConta() != null) {
			predicates.add(builder.equal(root.get(TalaoCheque_.conta).get(Conta_.id), filter.getConta()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(TalaoCheque_.filial).get(Filial_.id), filter.getFilial()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(TalaoCheque_.status), filter.getStatus()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long TalaoChequeResumo(TalaoChequeFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<TalaoCheque> root = criteria.from(TalaoCheque.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<TalaoChequeResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
