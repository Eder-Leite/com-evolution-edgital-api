package com.evolution.repository.tesouraria.conta;

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
import com.evolution.model.tesouraria.Agencia_;
import com.evolution.model.tesouraria.Banco_;
import com.evolution.model.tesouraria.Conta;
import com.evolution.model.tesouraria.Conta_;
import com.evolution.repository.tesouraria.filter.ContaFilter;
import com.evolution.repository.tesouraria.projection.ContaResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public class ContaRepositoryImpl implements ContaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<ContaResumo> resumir(ContaFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ContaResumo> criteria = builder.createQuery(ContaResumo.class);
		Root<Conta> root = criteria.from(Conta.class);

		criteria.select(builder.construct(ContaResumo.class, 
				root.get(Conta_.id),
				root.get(Conta_.agencia).get(Agencia_.banco).get(Banco_.id),
				root.get(Conta_.agencia).get(Agencia_.banco).get(Banco_.descricao),
				root.get(Conta_.agencia).get(Agencia_.banco).get(Banco_.codigo),
				root.get(Conta_.agencia).get(Agencia_.id), 
				root.get(Conta_.agencia).get(Agencia_.codigo),
				root.get(Conta_.empresa).get(Empresa_.id), 
				root.get(Conta_.conta), 
				root.get(Conta_.digito),
				root.get(Conta_.descricao), 
				root.get(Conta_.tipo), 
				root.get(Conta_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Conta_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<ContaResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, ContaResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(ContaFilter filter, CriteriaBuilder builder, Root<Conta> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Conta_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Conta_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getBanco() != null) {
			predicates
					.add(builder.equal(root.get(Conta_.agencia).get(Agencia_.banco).get(Banco_.id), filter.getBanco()));
		}

		if (filter.getAgencia() != null) {
			predicates.add(builder.equal(root.get(Conta_.agencia).get(Agencia_.id), filter.getAgencia()));
		}

		if (filter.getConta() != null) {
			predicates.add(builder.equal(root.get(Conta_.conta), filter.getConta()));
		}

		if (filter.getTipo() != null) {
			predicates.add(builder.equal(root.get(Conta_.tipo), filter.getTipo()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Conta_.status), filter.getStatus()));
		}
		
		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Conta_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long ContaResumo(ContaFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Conta> root = criteria.from(Conta.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<ContaResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
