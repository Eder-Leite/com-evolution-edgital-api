package com.evolution.repository.livro.aliquotaUF;

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

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import com.evolution.model.adm.CategoriaProduto_;
import com.evolution.model.adm.Produto_;
import com.evolution.model.adm.SubCategoriaProduto_;
import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Estado_;
import com.evolution.model.cadastro.Regiao_;
import com.evolution.model.livro.AliquotaUF_;
import com.evolution.model.livro.AliquotaUF;
import com.evolution.model.livro.CodigoCFOP_;
import com.evolution.model.livro.Finalidade_;
import com.evolution.repository.livro.filter.AliquotaUFFilter;
import com.evolution.repository.livro.projection.AliquotaUFResumo;

public class AliquotaUFRepositoryImpl implements AliquotaUFRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<AliquotaUFResumo> resumir(AliquotaUFFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<AliquotaUFResumo> criteria = builder.createQuery(AliquotaUFResumo.class);
		Root<AliquotaUF> root = criteria.from(AliquotaUF.class);

		criteria.select(builder.construct(AliquotaUFResumo.class, 
				root.get(AliquotaUF_.id),
				root.get(AliquotaUF_.regiao).get(Regiao_.descricao), 
				root.get(AliquotaUF_.estado).get(Estado_.nome),
				root.get(AliquotaUF_.finalidade).get(Finalidade_.descricao),
				root.get(AliquotaUF_.codigoCFOP).get(CodigoCFOP_.codigo),
				root.get(AliquotaUF_.categoria).get(CategoriaProduto_.codigo),
				root.get(AliquotaUF_.subCategoriaProduto).get(SubCategoriaProduto_.codigo),
				root.get(AliquotaUF_.produto).get(Produto_.descricao), 
				root.get(AliquotaUF_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(AliquotaUF_.codigoCFOP)));
		orderList.add(builder.asc(root.get(AliquotaUF_.status)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<AliquotaUFResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, AliquotaUFResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(AliquotaUFFilter filter, CriteriaBuilder builder, Root<AliquotaUF> root) {

		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(AliquotaUF_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(AliquotaUF_.empresa).get(Empresa_.id), filter.getEmpresa()));
		}

		if (filter.getFinalidade() != null) {
			predicates.add(builder.equal(root.get(AliquotaUF_.finalidade).get(Finalidade_.id), filter.getFinalidade()));
		}

		if (!StringUtils.isEmpty(filter.getCFOP())) {
			predicates.add(builder.equal(root.get(AliquotaUF_.codigoCFOP).get(CodigoCFOP_.codigo), filter.getCFOP()));
		}

		if (!StringUtils.isEmpty(filter.getCodigoProduto())) {
			predicates
					.add(builder.equal(root.get(AliquotaUF_.produto).get(Produto_.codigo), filter.getCodigoProduto()));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(AliquotaUF_.status), filter.getStatus()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long AliquotaUFResumo(AliquotaUFFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<AliquotaUF> root = criteria.from(AliquotaUF.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<AliquotaUFResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
