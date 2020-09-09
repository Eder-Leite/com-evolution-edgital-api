package com.evolution.repository.adm.produto;

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
import com.evolution.model.adm.Produto;
import com.evolution.model.adm.Produto_;
import com.evolution.model.adm.SubCategoriaProduto_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.livro.UnidadeProduto_;
import com.evolution.repository.adm.filter.ProdutoFilter;
import com.evolution.repository.adm.projection.ProdutoResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class ProdutoRepositoryImpl implements ProdutoRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<ProdutoResumo> resumir(ProdutoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ProdutoResumo> criteria = builder.createQuery(ProdutoResumo.class);
		Root<Produto> root = criteria.from(Produto.class);

		criteria.select(builder.construct(ProdutoResumo.class, 
				
				root.get(Produto_.id),
				root.get(Produto_.subCategoria).get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.id),
				root.get(Produto_.subCategoria).get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.descricao),
				root.get(Produto_.subCategoria).get(SubCategoriaProduto_.id),
				root.get(Produto_.subCategoria).get(SubCategoriaProduto_.descricao), 
				root.get(Produto_.codigo),
				root.get(Produto_.descricao), 
				root.get(Produto_.unidade).get(UnidadeProduto_.sigla),
				root.get(Produto_.codigoBarra), 
				root.get(Produto_.foto), 
				root.get(Produto_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Produto_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<ProdutoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, ProdutoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(ProdutoFilter filter, CriteriaBuilder builder, Root<Produto> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Produto_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Produto_.subCategoria).get(SubCategoriaProduto_.categoria)
					.get(CategoriaProduto_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getCategoria() != null) {
			predicates.add(builder.equal(
					root.get(Produto_.subCategoria).get(SubCategoriaProduto_.categoria).get(CategoriaProduto_.id),
					filter.getCategoria()));
		}

		if (filter.getSubCategoria() != null) {
			predicates.add(builder.equal(root.get(Produto_.subCategoria).get(SubCategoriaProduto_.id),
					filter.getSubCategoria()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(Produto_.codigo), filter.getCodigo()));
		}

		if (!StringUtils.isEmpty(filter.getCodigoBarra())) {
			predicates.add(builder.equal(root.get(Produto_.codigoBarra), filter.getCodigoBarra()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Produto_.status), filter.getStatus()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Produto_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long ProdutoResumo(ProdutoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Produto> root = criteria.from(Produto.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<ProdutoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
