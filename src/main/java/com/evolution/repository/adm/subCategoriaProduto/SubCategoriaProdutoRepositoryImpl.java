package com.evolution.repository.adm.subCategoriaProduto;

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

import com.evolution.model.adm.CategoriaProduto_;
import com.evolution.model.adm.SubCategoriaProduto;
import com.evolution.model.adm.SubCategoriaProduto_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.repository.adm.filter.SubCategoriaProdutoFilter;
import com.evolution.repository.adm.projection.SubCategoriaProdutoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class SubCategoriaProdutoRepositoryImpl implements SubCategoriaProdutoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<SubCategoriaProdutoResumo> resumir(SubCategoriaProdutoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<SubCategoriaProdutoResumo> criteria = builder.createQuery(SubCategoriaProdutoResumo.class);
		Root<SubCategoriaProduto> root = criteria.from(SubCategoriaProduto.class);

		criteria.select(builder.construct(SubCategoriaProdutoResumo.class, 
				root.get(SubCategoriaProduto_.id),
				root.get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.id),
				root.get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.descricao),
				root.get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.codigo),
				root.get(SubCategoriaProduto_.codigo), 
				root.get(SubCategoriaProduto_.descricao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(SubCategoriaProduto_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<SubCategoriaProdutoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, SubCategoriaProdutoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(SubCategoriaProdutoFilter filter, CriteriaBuilder builder,
			Root<SubCategoriaProduto> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(SubCategoriaProduto_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(
					root.get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getCategoria() != null) {
			predicates.add(builder.equal(root.get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.id),
					filter.getCategoria()));
		}

		if (!StringUtils.isEmpty(filter.getCodigoCategoria())) {
			predicates.add(builder.equal(root.get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.codigo),
					filter.getCodigoCategoria()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(SubCategoriaProduto_.codigo), filter.getCodigo()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(SubCategoriaProduto_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long SubCategoriaProdutoResumo(SubCategoriaProdutoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<SubCategoriaProduto> root = criteria.from(SubCategoriaProduto.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<SubCategoriaProdutoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
