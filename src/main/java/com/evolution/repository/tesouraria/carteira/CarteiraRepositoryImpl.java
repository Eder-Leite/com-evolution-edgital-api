package com.evolution.repository.tesouraria.carteira;

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
import com.evolution.model.tesouraria.Carteira;
import com.evolution.model.tesouraria.Carteira_;
import com.evolution.repository.tesouraria.filter.CarteiraFilter;
import com.evolution.repository.tesouraria.projection.CarteiraResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class CarteiraRepositoryImpl implements CarteiraRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<CarteiraResumo> resumir(CarteiraFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<CarteiraResumo> criteria = builder.createQuery(CarteiraResumo.class);
		Root<Carteira> root = criteria.from(Carteira.class);

		criteria.select(builder.construct(CarteiraResumo.class, 
				root.get(Carteira_.id),
				root.get(Carteira_.empresa).get(Empresa_.id), 
				root.get(Carteira_.empresa).get(Empresa_.nome),
				root.get(Carteira_.descricao), 
				root.get(Carteira_.tipo)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Carteira_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<CarteiraResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, CarteiraResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(CarteiraFilter filter, CriteriaBuilder builder, Root<Carteira> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Carteira_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Carteira_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getTipo() != null) {
			predicates.add(builder.equal(root.get(Carteira_.tipo), filter.getTipo()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Carteira_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long CarteiraResumo(CarteiraFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Carteira> root = criteria.from(Carteira.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<CarteiraResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
