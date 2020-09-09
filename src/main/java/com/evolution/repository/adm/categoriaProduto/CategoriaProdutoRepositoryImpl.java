package com.evolution.repository.adm.categoriaProduto;

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

import com.evolution.model.adm.CategoriaProduto;
import com.evolution.model.adm.CategoriaProduto_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.repository.adm.filter.CategoriaProdutoFilter;
import com.evolution.repository.adm.projection.CategoriaProdutoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CategoriaProdutoRepositoryImpl implements CategoriaProdutoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CategoriaProdutoResumo> resumir(CategoriaProdutoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CategoriaProdutoResumo> criteria = builder.createQuery(CategoriaProdutoResumo.class);
		Root<CategoriaProduto> root = criteria.from(CategoriaProduto.class);

		criteria.select(builder.construct(CategoriaProdutoResumo.class,
				root.get(CategoriaProduto_.id),
				root.get(CategoriaProduto_.empresa).get(Empresa_.id),
				root.get(CategoriaProduto_.empresa).get(Empresa_.nome),
				root.get(CategoriaProduto_.codigo), 
				root.get(CategoriaProduto_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(CategoriaProduto_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CategoriaProdutoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CategoriaProdutoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(CategoriaProdutoFilter filter, CriteriaBuilder builder,
			Root<CategoriaProduto> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(CategoriaProduto_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(CategoriaProduto_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}
		
		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(CategoriaProduto_.codigo), filter.getCodigo()));
		}
		
		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(CategoriaProduto_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CategoriaProdutoResumo(CategoriaProdutoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<CategoriaProduto> root = criteria.from(CategoriaProduto.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CategoriaProdutoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
