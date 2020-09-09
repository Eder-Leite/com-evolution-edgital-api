package com.evolution.repository.seguranca.usuario;

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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import com.evolution.model.cadastro.Empresa_;
import com.evolution.model.cadastro.Filial_;
import com.evolution.model.seguranca.Usuario;
import com.evolution.model.seguranca.Usuario_;
import com.evolution.repository.seguranca.filter.UsuarioFilter;
import com.evolution.repository.seguranca.projection.UsuarioResumo;

public class UsuarioRepositoryImpl implements UsuarioRepositoryQuery {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<UsuarioResumo> resumir(UsuarioFilter filter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<UsuarioResumo> criteria = builder.createQuery(UsuarioResumo.class);
		Root<Usuario> root = criteria.from(Usuario.class);

		criteria.select(builder.construct(UsuarioResumo.class, 
				root.get(Usuario_.id),
				root.get(Usuario_.filial).get(Filial_.empresa).get(Empresa_.id),
				root.get(Usuario_.filial).get(Filial_.empresa).get(Empresa_.nome),
				root.get(Usuario_.filial).get(Filial_.id), 
				root.get(Usuario_.filial).get(Filial_.nome),
				root.get(Usuario_.nome), 
				root.get(Usuario_.email), 
				root.get(Usuario_.cpf), 
				root.get(Usuario_.tipo),
				root.get(Usuario_.dataCadastro), 
				root.get(Usuario_.foto), 
				root.get(Usuario_.status)));

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Order> orderList = new ArrayList();
		orderList.add(builder.asc(root.get(Usuario_.nome)));
		criteria.orderBy(orderList);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		TypedQuery<UsuarioResumo> query = manager.createQuery(criteria);
		adicionarRestricoesDePaginacao(query, pageable);

		return new PageImpl<>(query.getResultList(), pageable, UsuarioResumo(filter));
	}

	private Predicate[] criarRestricoesResumo(UsuarioFilter filter, CriteriaBuilder builder, Root<Usuario> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (filter.getId() != null) {
			predicates.add(builder.equal(root.get(Usuario_.id), filter.getId()));
		}

		if (filter.getEmpresa() != null) {
			predicates.add(builder.equal(root.get(Usuario_.filial).get(Filial_.empresa).get(Empresa_.id),
					filter.getEmpresa()));
		}

		if (filter.getFilial() != null) {
			predicates.add(builder.equal(root.get(Usuario_.filial).get(Filial_.id), filter.getFilial()));
		}

		if (filter.getEmail() != null) {
			predicates.add(builder.equal(root.get(Usuario_.email), filter.getEmail()));
		}

		if (!StringUtils.isEmpty(filter.getCpf())) {
			predicates.add(builder.equal(root.get(Usuario_.cpf), filter.getCpf()));
		}

		if (!StringUtils.isEmpty(filter.getNome())) {
			predicates.add(
					builder.like(builder.lower(root.get(Usuario_.nome)), "%" + filter.getNome().toLowerCase() + "%"));
		}

		if (filter.getStatus() != null) {
			predicates.add(builder.equal(root.get(Usuario_.status), filter.getStatus()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

	private Long UsuarioResumo(UsuarioFilter filter) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		Root<Usuario> root = criteria.from(Usuario.class);

		Predicate[] predicates = criarRestricoesResumo(filter, builder, root);
		criteria.where(predicates);

		criteria.select(builder.count(root));
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<UsuarioResumo> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);

	}
}
