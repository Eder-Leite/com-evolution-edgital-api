package com.evolution.repository.livro.finalidade;

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

import com.evolution.model.adm.OperacaoEstoque_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.livro.Finalidade;
import com.evolution.model.livro.Finalidade_;
import com.evolution.repository.livro.filter.FinalidadeFilter;
import com.evolution.repository.livro.projection.FinalidadeResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class FinalidadeRepositoryImpl implements FinalidadeRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<FinalidadeResumo> resumir(FinalidadeFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<FinalidadeResumo> criteria = builder.createQuery(FinalidadeResumo.class);
		Root<Finalidade> root = criteria.from(Finalidade.class);

		criteria.select(builder.construct(FinalidadeResumo.class, 
				root.get(Finalidade_.id),
				root.get(Finalidade_.empresa).get(Empresa_.id),
				root.get(Finalidade_.operacaoEstoque).get(OperacaoEstoque_.tipo),
				root.get(Finalidade_.descricao),
				root.get(Finalidade_.indicadorPresenca), 
				root.get(Finalidade_.finalidadeEmissao), 
				root.get(Finalidade_.modalidadeFrete),
				root.get(Finalidade_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Finalidade_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<FinalidadeResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, FinalidadeResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(FinalidadeFilter filter, CriteriaBuilder builder,
			Root<Finalidade> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Finalidade_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Finalidade_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getTipoMovimento() != null) {
			predicates.add(builder.equal(root.get(Finalidade_.operacaoEstoque).get(OperacaoEstoque_.tipo), filter.getTipoMovimento()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Finalidade_.status), filter.getStatus()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Finalidade_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long FinalidadeResumo(FinalidadeFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Finalidade> root = criteria.from(Finalidade.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<FinalidadeResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
