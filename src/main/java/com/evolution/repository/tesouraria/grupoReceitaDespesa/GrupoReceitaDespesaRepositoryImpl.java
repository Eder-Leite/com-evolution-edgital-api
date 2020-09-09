package com.evolution.repository.tesouraria.grupoReceitaDespesa;

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
import com.evolution.model.tesouraria.GrupoReceitaDespesa;
import com.evolution.model.tesouraria.GrupoReceitaDespesa_;
import com.evolution.repository.tesouraria.filter.GrupoReceitaDespesaFilter;
import com.evolution.repository.tesouraria.projection.GrupoReceitaDespesaResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

public class GrupoReceitaDespesaRepositoryImpl implements GrupoReceitaDespesaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<GrupoReceitaDespesaResumo> resumir(GrupoReceitaDespesaFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<GrupoReceitaDespesaResumo> criteria = builder.createQuery(GrupoReceitaDespesaResumo.class);
		Root<GrupoReceitaDespesa> root = criteria.from(GrupoReceitaDespesa.class);

		criteria.select(builder.construct(GrupoReceitaDespesaResumo.class, 
				root.get(GrupoReceitaDespesa_.id),
				root.get(GrupoReceitaDespesa_.carteira).get(Carteira_.empresa).get(Empresa_.id),
				root.get(GrupoReceitaDespesa_.carteira).get(Carteira_.id),
				root.get(GrupoReceitaDespesa_.carteira).get(Carteira_.descricao),
				root.get(GrupoReceitaDespesa_.carteira).get(Carteira_.tipo), 
				root.get(GrupoReceitaDespesa_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(GrupoReceitaDespesa_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<GrupoReceitaDespesaResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, GrupoReceitaDespesaResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(GrupoReceitaDespesaFilter filter, CriteriaBuilder builder,
			Root<GrupoReceitaDespesa> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(GrupoReceitaDespesa_.id), filter.getId()));
		}

		if (filter.getCarteira() != null) {
			predicates.add(
					builder.equal(root.get(GrupoReceitaDespesa_.carteira).get(Carteira_.id), filter.getCarteira()));
		}

		if (filter.getEmpresa() != null) {
			predicates
					.add(builder.equal(root.get(GrupoReceitaDespesa_.carteira).get(Carteira_.empresa).get(Empresa_.id),
							filter.getEmpresa()));
		}

		if (filter.getTipoCarteira() != null) {
			predicates.add(builder.equal(root.get(GrupoReceitaDespesa_.carteira).get(Carteira_.tipo),
					filter.getTipoCarteira()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(GrupoReceitaDespesa_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long GrupoReceitaDespesaResumo(GrupoReceitaDespesaFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<GrupoReceitaDespesa> root = criteria.from(GrupoReceitaDespesa.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<GrupoReceitaDespesaResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
