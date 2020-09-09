package com.evolution.repository.cadastro.vendedor;

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
import com.evolution.model.cadastro.Vendedor;
import com.evolution.model.cadastro.Vendedor_;
import com.evolution.repository.cadastro.filter.VendedorFilter;
import com.evolution.repository.cadastro.projection.VendedorResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class VendedorRepositoryImpl implements VendedorRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<VendedorResumo> resumir(VendedorFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<VendedorResumo> criteria = builder.createQuery(VendedorResumo.class);
		Root<Vendedor> root = criteria.from(Vendedor.class);

		criteria.select(builder.construct(VendedorResumo.class, 
				root.get(Vendedor_.id),
				root.get(Vendedor_.empresa).get(Empresa_.id), 
				root.get(Vendedor_.nome), root.get(Vendedor_.cpf),
				root.get(Vendedor_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Vendedor_.nome)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<VendedorResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, VendedorResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(VendedorFilter filter, CriteriaBuilder builder, Root<Vendedor> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Vendedor_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Vendedor_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (!StringUtils.isEmpty(filter.getCpf())) {
			predicates.add(builder.equal(root.get(Vendedor_.cpf), filter.getCpf()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Vendedor_.status), filter.getStatus()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long VendedorResumo(VendedorFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Vendedor> root = criteria.from(Vendedor.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<VendedorResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
