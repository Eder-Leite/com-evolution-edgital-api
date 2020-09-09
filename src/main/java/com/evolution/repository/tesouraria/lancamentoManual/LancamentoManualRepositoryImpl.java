package com.evolution.repository.tesouraria.lancamentoManual;

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
import com.evolution.model.tesouraria.LancamentoManual;
import com.evolution.model.tesouraria.LancamentoManual_;
import com.evolution.repository.tesouraria.filter.LancamentoManualFilter;
import com.evolution.repository.tesouraria.projection.LancamentoManualResumo;

public class LancamentoManualRepositoryImpl implements LancamentoManualRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<LancamentoManualResumo> resumir(LancamentoManualFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<LancamentoManualResumo> criteria = builder.createQuery(LancamentoManualResumo.class);
		Root<LancamentoManual> root = criteria.from(LancamentoManual.class);

		criteria.select(builder.construct(LancamentoManualResumo.class, 
				root.get(LancamentoManual_.id),
				root.get(LancamentoManual_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(LancamentoManual_.filial).get(Filial_.id), 
				root.get(LancamentoManual_.tipoLancamento), 
				root.get(LancamentoManual_.data),
				root.get(LancamentoManual_.documento),
				root.get(LancamentoManual_.cadastro).get(Cadastro_.nomeRazao), 
				root.get(LancamentoManual_.valor),
				root.get(LancamentoManual_.situacao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(LancamentoManual_.data)));
		orderList.add(builder.asc(root.get(LancamentoManual_.id)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<LancamentoManualResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, LancamentoManualResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(LancamentoManualFilter filter, CriteriaBuilder builder, Root<LancamentoManual> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(LancamentoManual_.id), filter.getId()));
		}

		if (filter.getSituacao() != null) {
			predicates.add(builder.equal(root.get(LancamentoManual_.situacao), filter.getSituacao()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(LancamentoManual_.cadastro).get(Cadastro_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(LancamentoManual_.filial).get(Filial_.id),
					filter.getFilial()));
		}
		
		if (filter.getTipoLancamento() != null) {
			predicates.add(builder.equal(root.get(LancamentoManual_.tipoLancamento), filter.getTipoLancamento()));
		}
		
		if (!StringUtils.isEmpty(filter.getDocumento())) {
			predicates.add(builder.equal(root.get(LancamentoManual_.documento), filter.getDocumento()));
		}

		if (!StringUtils.isEmpty(filter.getCliente())) {
			predicates.add(builder.like(builder.lower(root.get(LancamentoManual_.cadastro).get(Cadastro_.nomeRazao)),
					"%" + filter.getCliente().toLowerCase() + "%"));
		}

		if (filter.getDataDe() != null) {
			predicates.add(builder.greaterThanOrEqualTo(builder.function("trunc", Date.class, root.get(LancamentoManual_.data)),
					filter.getDataDe()));
		}

		if (filter.getDataAte() != null) {
			predicates.add(builder.lessThanOrEqualTo(builder.function("trunc", Date.class, root.get(LancamentoManual_.data)),
					filter.getDataAte()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long LancamentoManualResumo(LancamentoManualFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<LancamentoManual> root = criteria.from(LancamentoManual.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<LancamentoManualResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
