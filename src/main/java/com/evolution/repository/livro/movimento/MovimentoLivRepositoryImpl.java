package com.evolution.repository.livro.movimento;

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
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.livro.Modelo_;
import com.evolution.model.livro.MovimentoLiv;
import com.evolution.model.livro.MovimentoLiv_;
import com.evolution.repository.livro.filter.MovimentoFilter;
import com.evolution.repository.livro.projection.MovimentoResumo;

public class MovimentoLivRepositoryImpl implements MovimentoLivRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<MovimentoResumo> resumir(MovimentoFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<MovimentoResumo> criteria = builder.createQuery(MovimentoResumo.class);
		Root<MovimentoLiv> root = criteria.from(MovimentoLiv.class);

		criteria.select(builder.construct(MovimentoResumo.class, 
				root.get(MovimentoLiv_.id),
				root.get(MovimentoLiv_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(MovimentoLiv_.filial).get(Filial_.id), 
				root.get(MovimentoLiv_.cadastro).get(Cadastro_.nomeRazao),
				root.get(MovimentoLiv_.numero), 
				root.get(MovimentoLiv_.modelo).get(Modelo_.codigo),
				root.get(MovimentoLiv_.dataMovimento), 
				root.get(MovimentoLiv_.totalMovimento)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(MovimentoLiv_.dataMovimento)));
		orderList.add(builder.asc(root.get(MovimentoLiv_.numero)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<MovimentoResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, MovimentoResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(MovimentoFilter filter, CriteriaBuilder builder, Root<MovimentoLiv> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(MovimentoLiv_.id), filter.getId()));
		}

		if (filter.getNumero() != null) {
			predicates.add(builder.equal(root.get(MovimentoLiv_.id), filter.getNumero()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(MovimentoLiv_.filial).get(Filial_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(MovimentoLiv_.filial).get(Filial_.id), filter.getFilial()));
		}

		if (!StringUtils.isEmpty(filter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get(MovimentoLiv_.cadastro).get(Cadastro_.nomeRazao)),
					"%" + filter.getNome().toLowerCase() + "%"));
		}
		
		if (filter.getDataDe() != null) {
			predicates.add(builder.greaterThanOrEqualTo(builder.function("trunc", Date.class, root.get(MovimentoLiv_.dataMovimento)),
					filter.getDataDe()));
		}

		if (filter.getDataAte() != null) {
			predicates.add(builder.lessThanOrEqualTo(builder.function("trunc", Date.class, root.get(MovimentoLiv_.dataMovimento)),
					filter.getDataAte()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long MovimentoResumo(MovimentoFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<MovimentoLiv> root = criteria.from(MovimentoLiv.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<MovimentoResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
