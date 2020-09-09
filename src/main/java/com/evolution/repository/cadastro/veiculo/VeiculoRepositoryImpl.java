package com.evolution.repository.cadastro.veiculo;

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

import com.evolution.model.cadastro.Veiculo;
import com.evolution.model.cadastro.Veiculo_;
import com.evolution.model.cadastro.Cadastro_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.repository.cadastro.filter.VeiculoFilter;
import com.evolution.repository.cadastro.projection.VeiculoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class VeiculoRepositoryImpl implements VeiculoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<VeiculoResumo> resumir(VeiculoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<VeiculoResumo> criteria = builder.createQuery(VeiculoResumo.class);
		Root<Veiculo> root = criteria.from(Veiculo.class);

		criteria.select(builder.construct(VeiculoResumo.class, 
				root.get(Veiculo_.id),
				root.get(Veiculo_.cadastro).get(Cadastro_.id), 
				root.get(Veiculo_.cadastro).get(Cadastro_.nomeRazao),
				root.get(Veiculo_.tipoVeiculo), 
				root.get(Veiculo_.descricao),
				root.get(Veiculo_.placa), 
				root.get(Veiculo_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Veiculo_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<VeiculoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, VeiculoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(VeiculoFilter filter, CriteriaBuilder builder, Root<Veiculo> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Veiculo_.id), filter.getId()));
		}
		
		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Veiculo_.cadastro).get(Cadastro_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getCadastro() != null) {
			predicates.add(builder.equal(root.get(Veiculo_.cadastro), filter.getCadastro()));
		}

		if (!StringUtils.isEmpty(filter.getPlaca())) {
			predicates.add(builder.equal(root.get(Veiculo_.placa), filter.getPlaca()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Veiculo_.status), filter.getStatus()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Veiculo_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}
		
		if (!StringUtils.isEmpty(filter.getNomeCliente())) {
			predicates.add(builder.like(builder.lower(root.get(Veiculo_.cadastro).get(Cadastro_.nomeRazao)),
					"%" + filter.getNomeCliente().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long VeiculoResumo(VeiculoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Veiculo> root = criteria.from(Veiculo.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<VeiculoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
