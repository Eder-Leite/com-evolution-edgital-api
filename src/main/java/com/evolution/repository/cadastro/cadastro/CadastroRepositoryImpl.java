package com.evolution.repository.cadastro.cadastro;

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

import com.evolution.model.cadastro.Cadastro;
import com.evolution.model.cadastro.Cadastro_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.repository.cadastro.filter.CadastroFilter;
import com.evolution.repository.cadastro.projection.CadastroResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CadastroRepositoryImpl implements CadastroRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CadastroResumo> resumir(CadastroFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CadastroResumo> criteria = builder.createQuery(CadastroResumo.class);
		Root<Cadastro> root = criteria.from(Cadastro.class);

		criteria.select(builder.construct(CadastroResumo.class, 
				root.get(Cadastro_.id),
				root.get(Cadastro_.empresa).get(Empresa_.id), 
				root.get(Cadastro_.empresa).get(Empresa_.nome),
				root.get(Cadastro_.tipo), 
				root.get(Cadastro_.tipoPessoa), 
				root.get(Cadastro_.nomeRazao),
				root.get(Cadastro_.nomeFantasia), 
				root.get(Cadastro_.cnpjCpf), 
				root.get(Cadastro_.inscricaoEstadualRG),
				root.get(Cadastro_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Cadastro_.nomeRazao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CadastroResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CadastroResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(CadastroFilter filter, CriteriaBuilder builder, Root<Cadastro> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Cadastro_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Cadastro_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getCnpjCpf() != null) {
			predicates.add(builder.equal(root.get(Cadastro_.cnpjCpf), filter.getCnpjCpf()));
		}

		if (!StringUtils.isEmpty(filter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get(Cadastro_.nomeRazao)),
					"%" + filter.getNome().toLowerCase() + "%"));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Cadastro_.status), filter.getStatus()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CadastroResumo(CadastroFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Cadastro> root = criteria.from(Cadastro.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CadastroResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
