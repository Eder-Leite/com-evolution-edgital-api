package com.evolution.repository.tesouraria.agencia;

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

import com.evolution.model.tesouraria.Agencia;
import com.evolution.model.tesouraria.Agencia_;
import com.evolution.model.tesouraria.Banco_;
import com.evolution.repository.tesouraria.filter.AgenciaFilter;
import com.evolution.repository.tesouraria.projection.AgenciaResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class AgenciaRepositoryImpl implements AgenciaRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<AgenciaResumo> resumir(AgenciaFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<AgenciaResumo> criteria = builder.createQuery(AgenciaResumo.class);
		Root<Agencia> root = criteria.from(Agencia.class);

		criteria.select(builder.construct(AgenciaResumo.class, 
				root.get(Agencia_.id),
				root.get(Agencia_.banco).get(Banco_.id), 
				root.get(Agencia_.banco).get(Banco_.descricao),
				root.get(Agencia_.codigo), 
				root.get(Agencia_.descricao), 
				root.get(Agencia_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Agencia_.descricao)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<AgenciaResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, AgenciaResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(AgenciaFilter filter, CriteriaBuilder builder, Root<Agencia> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Agencia_.id), filter.getId()));
		}

		if (filter.getBanco() != null) {
			predicates.add(builder.equal(root.get(Agencia_.banco).get(Banco_.id), filter.getBanco()));
		}
		
		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Agencia_.status), filter.getStatus()));
		}

		if (!StringUtils.isEmpty(filter.getCodigo())) {
			predicates.add(builder.equal(root.get(Agencia_.codigo), filter.getCodigo()));
		}

		if (!StringUtils.isEmpty(filter.getDescricao())) {
			predicates.add(builder.like(builder.lower(root.get(Agencia_.descricao)),
					"%" + filter.getDescricao().toLowerCase() + "%"));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long AgenciaResumo(AgenciaFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Agencia> root = criteria.from(Agencia.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<AgenciaResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
