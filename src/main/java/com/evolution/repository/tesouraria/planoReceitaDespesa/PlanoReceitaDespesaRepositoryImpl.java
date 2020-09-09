package com.evolution.repository.tesouraria.planoReceitaDespesa;

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
import com.evolution.model.tesouraria.Carteira_;
import com.evolution.model.tesouraria.GrupoReceitaDespesa_;
import com.evolution.model.tesouraria.PlanoReceitaDespesa;
import com.evolution.model.tesouraria.PlanoReceitaDespesa_;
import com.evolution.repository.tesouraria.filter.PlanoReceitaDespesaFilter;
import com.evolution.repository.tesouraria.projection.PlanoReceitaDespesaResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public class PlanoReceitaDespesaRepositoryImpl implements PlanoReceitaDespesaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<PlanoReceitaDespesaResumo> resumir(PlanoReceitaDespesaFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<PlanoReceitaDespesaResumo> criteria = builder.createQuery(PlanoReceitaDespesaResumo.class);
		Root<PlanoReceitaDespesa> root = criteria.from(PlanoReceitaDespesa.class);

		criteria.select(builder.construct(PlanoReceitaDespesaResumo.class, 
				root.get(PlanoReceitaDespesa_.id),
				root.get(PlanoReceitaDespesa_.grupoReceitaDespesa).get(GrupoReceitaDespesa_.carteira).get(Carteira_.empresa).get(Empresa_.id),
				root.get(PlanoReceitaDespesa_.grupoReceitaDespesa).get(GrupoReceitaDespesa_.id),
				root.get(PlanoReceitaDespesa_.grupoReceitaDespesa).get(GrupoReceitaDespesa_.carteira).get(Carteira_.tipo),
				root.get(PlanoReceitaDespesa_.grupoReceitaDespesa).get(GrupoReceitaDespesa_.carteira).get(Carteira_.descricao),
				root.get(PlanoReceitaDespesa_.grupoReceitaDespesa).get(GrupoReceitaDespesa_.descricao),
				root.get(PlanoReceitaDespesa_.descricao), 
				root.get(PlanoReceitaDespesa_.taxaDesconto),
				root.get(PlanoReceitaDespesa_.taxaJuros)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(PlanoReceitaDespesa_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<PlanoReceitaDespesaResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, PlanoReceitaDespesaResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(PlanoReceitaDespesaFilter filter, CriteriaBuilder builder,
			Root<PlanoReceitaDespesa> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(PlanoReceitaDespesa_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(PlanoReceitaDespesa_.grupoReceitaDespesa)
					.get(GrupoReceitaDespesa_.carteira).get(Carteira_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getGrupoReceitaDespesa() != null) {
			predicates
					.add(builder.equal(root.get(PlanoReceitaDespesa_.grupoReceitaDespesa).get(GrupoReceitaDespesa_.id),
							filter.getGrupoReceitaDespesa()));
		}
		
		if (filter.getTipoCarteira() != null) {
			predicates.add(builder.equal(root.get(PlanoReceitaDespesa_.grupoReceitaDespesa)
					.get(GrupoReceitaDespesa_.carteira).get(Carteira_.tipo), filter.getTipoCarteira()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(PlanoReceitaDespesa_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long PlanoReceitaDespesaResumo(PlanoReceitaDespesaFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<PlanoReceitaDespesa> root = criteria.from(PlanoReceitaDespesa.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<PlanoReceitaDespesaResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
