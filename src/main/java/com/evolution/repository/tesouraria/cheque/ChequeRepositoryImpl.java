package com.evolution.repository.tesouraria.cheque;

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
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.tesouraria.Agencia_;
import com.evolution.model.tesouraria.Banco_;
import com.evolution.model.tesouraria.Cheque;
import com.evolution.model.tesouraria.Cheque_;
import com.evolution.model.tesouraria.Conta_;
import com.evolution.model.tesouraria.TalaoCheque_;
import com.evolution.repository.tesouraria.filter.ChequeFilter;
import com.evolution.repository.tesouraria.projection.ChequeResumo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

public class ChequeRepositoryImpl implements ChequeRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<ChequeResumo> resumir(ChequeFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<ChequeResumo> criteria = builder.createQuery(ChequeResumo.class);
		Root<Cheque> root = criteria.from(Cheque.class);

		criteria.select(builder.construct(ChequeResumo.class, root.get(Cheque_.id),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.filial).get(Filial_.id),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.id),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.banco).get(Banco_.id),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.banco).get(Banco_.codigo),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.id),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.agencia).get(Agencia_.codigo),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.id),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.conta),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.digito),
				root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.descricao), 
				root.get(Cheque_.numero),
				root.get(Cheque_.valor), 
				root.get(Cheque_.nominal), 
				root.get(Cheque_.dataEmissao),
				root.get(Cheque_.dataMovimento), 
				root.get(Cheque_.situacao)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Cheque_.numero)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<ChequeResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, ChequeResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(ChequeFilter filter, CriteriaBuilder builder, Root<Cheque> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Cheque_.id), filter.getId()));
		}

		if (filter.getTalao() != null) {
			predicates.add(builder.equal(root.get(Cheque_.talaoCheque).get(TalaoCheque_.id), filter.getTalao()));
		}

		if (filter.getConta() != null) {
			predicates.add(builder.equal(root.get(Cheque_.talaoCheque).get(TalaoCheque_.conta).get(Conta_.id),
					filter.getConta()));
		}

		if (filter.getNumero() != null) {
			predicates.add(builder.equal(root.get(Cheque_.numero), filter.getNumero()));
		}

		if (filter.getSituacao() != null) {
			predicates.add(builder.equal(root.get(Cheque_.situacao), filter.getSituacao()));
		}

		if (filter.getDataMovimentoDe() != null) {
			predicates.add(
					builder.greaterThanOrEqualTo(root.get(Cheque_.dataMovimento),filter.getDataMovimentoDe()));
		}

		if (filter.getDataMovimentoAte() != null) {
			predicates.add(
					builder.lessThanOrEqualTo( root.get(Cheque_.dataMovimento),filter.getDataMovimentoAte()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long ChequeResumo(ChequeFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Cheque> root = criteria.from(Cheque.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<ChequeResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
