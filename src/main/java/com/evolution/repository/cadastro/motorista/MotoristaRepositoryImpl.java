package com.evolution.repository.cadastro.motorista;

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

import com.evolution.model.cadastro.Motorista;
import com.evolution.model.cadastro.Motorista_;
import com.evolution.model.cadastro.Cadastro_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.repository.cadastro.filter.MotoristaFilter;
import com.evolution.repository.cadastro.projection.MotoristaResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class MotoristaRepositoryImpl implements MotoristaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<MotoristaResumo> resumir(MotoristaFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<MotoristaResumo> criteria = builder.createQuery(MotoristaResumo.class);
		Root<Motorista> root = criteria.from(Motorista.class);

		criteria.select(builder.construct(MotoristaResumo.class, 
				root.get(Motorista_.id),
				root.get(Motorista_.cadastro).get(Cadastro_.id), 
				root.get(Motorista_.cadastro).get(Cadastro_.nomeRazao),
				root.get(Motorista_.nome), 
				root.get(Motorista_.cpf)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Motorista_.nome)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<MotoristaResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, MotoristaResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(MotoristaFilter filter, CriteriaBuilder builder, Root<Motorista> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Motorista_.id), filter.getId()));
		}

		if (filter.getCadastro() != null) {
			predicates.add(builder.equal(root.get(Motorista_.cadastro), filter.getCadastro()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Motorista_.cadastro).get(Cadastro_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (!StringUtils.isEmpty(filter.getCpf())) {
			predicates.add(builder.equal(root.get(Motorista_.cpf), filter.getCpf()));
		}

		if (!StringUtils.isEmpty(filter.getNome())) {
			predicates.add(
					builder.like(builder.lower(root.get(Motorista_.nome)), "%" + filter.getNome().toLowerCase() + "%"));
		}

		if (!StringUtils.isEmpty(filter.getNomeCliente())) {
			predicates.add(builder.like(builder.lower(root.get(Motorista_.cadastro).get(Cadastro_.nomeRazao)),
					"%" + filter.getNomeCliente().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long MotoristaResumo(MotoristaFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Motorista> root = criteria.from(Motorista.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<MotoristaResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
