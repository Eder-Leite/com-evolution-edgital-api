package com.evolution.repository.tesouraria.titulo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import com.evolution.model.cadastro.Cadastro_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.tesouraria.Titulo;
import com.evolution.model.tesouraria.Titulo_;
import com.evolution.repository.tesouraria.filter.TituloFilter;
import com.evolution.repository.tesouraria.projection.TituloResumo;


public class TituloRepositoryImpl implements TituloRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<TituloResumo> resumir(TituloFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<TituloResumo> criteria = builder.createQuery(TituloResumo.class);
		Root<Titulo> root = criteria.from(Titulo.class);

		criteria.select(builder.construct(TituloResumo.class, 
				root.get(Titulo_.id),
				root.get(Titulo_.empresa).get(Empresa_.id),
				root.get(Titulo_.cadastro).get(Cadastro_.nomeRazao), 
				root.get(Titulo_.parcela), 
				root.get(Titulo_.documento),
				root.get(Titulo_.valor),
				root.get(Titulo_.emissao),
				root.get(Titulo_.vencimento),
				root.get(Titulo_.liquidacao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Titulo_.emissao)));
		orderList.add(builder.asc(root.get(Titulo_.parcela)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<TituloResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, TituloResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(TituloFilter filter, CriteriaBuilder builder, Root<Titulo> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Titulo_.id), filter.getId()));
		}

		if (!StringUtils.isEmpty(filter.getDocumento())) {
			predicates.add(builder.equal(root.get(Titulo_.documento), filter.getDocumento()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Titulo_.cadastro).get(Cadastro_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (!StringUtils.isEmpty(filter.getCliente())) {
			predicates.add(builder.like(builder.lower(root.get(Titulo_.cadastro).get(Cadastro_.nomeRazao)),
					"%" + filter.getCliente().toLowerCase() + "%"));
		}

		if (filter.getDataDe() != null) {
			predicates.add(builder.greaterThanOrEqualTo(builder.function("trunc", Date.class, root.get(Titulo_.emissao)),
					filter.getDataDe()));
		}

		if (filter.getDataAte() != null) {
			predicates.add(builder.lessThanOrEqualTo(builder.function("trunc", Date.class, root.get(Titulo_.emissao)),
					filter.getDataAte()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long TituloResumo(TituloFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Titulo> root = criteria.from(Titulo.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<TituloResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
