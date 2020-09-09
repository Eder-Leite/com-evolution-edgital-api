package com.evolution.repository.livro.complementoNatureza;

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
import com.evolution.model.livro.CodigoCFOP_;
import com.evolution.model.livro.ComplementoNatureza;
import com.evolution.model.livro.ComplementoNatureza_;
import com.evolution.repository.livro.filter.ComplementoNaturezaFilter;
import com.evolution.repository.livro.projection.ComplementoNaturezaResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class ComplementoNaturezaRepositoryImpl implements ComplementoNaturezaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<ComplementoNaturezaResumo> resumir(ComplementoNaturezaFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ComplementoNaturezaResumo> criteria = builder.createQuery(ComplementoNaturezaResumo.class);
		Root<ComplementoNatureza> root = criteria.from(ComplementoNatureza.class);

		criteria.select(builder.construct(ComplementoNaturezaResumo.class, 
				root.get(ComplementoNatureza_.id),
				root.get(ComplementoNatureza_.empresa).get(Empresa_.id),
				root.get(ComplementoNatureza_.codigoCFOP).get(CodigoCFOP_.codigo),
				root.get(ComplementoNatureza_.numero), 
				root.get(ComplementoNatureza_.descricao),
				root.get(ComplementoNatureza_.movimentoFinanceiro), 
				root.get(ComplementoNatureza_.prazoVista),
				root.get(ComplementoNatureza_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(ComplementoNatureza_.codigoCFOP)));
		orderList.add(builder.asc(root.get(ComplementoNatureza_.numero)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<ComplementoNaturezaResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, ComplementoNaturezaResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(ComplementoNaturezaFilter filter, CriteriaBuilder builder,
			Root<ComplementoNatureza> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(ComplementoNatureza_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(ComplementoNatureza_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getNumero() != null) {
			predicates.add(builder.equal(root.get(ComplementoNatureza_.numero), filter.getNumero()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(ComplementoNatureza_.status), filter.getStatus()));
		}

		if (filter.getPrazoVista() != null) {
			predicates.add(builder.equal(root.get(ComplementoNatureza_.prazoVista), filter.getPrazoVista()));
		}

		if (!StringUtils.isEmpty(filter.getCfop())) {
			predicates.add(
					builder.equal(root.get(ComplementoNatureza_.codigoCFOP).get(CodigoCFOP_.codigo), filter.getCfop()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(ComplementoNatureza_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long ComplementoNaturezaResumo(ComplementoNaturezaFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<ComplementoNatureza> root = criteria.from(ComplementoNatureza.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<ComplementoNaturezaResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
