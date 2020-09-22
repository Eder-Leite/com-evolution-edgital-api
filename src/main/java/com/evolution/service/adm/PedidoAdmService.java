package com.evolution.service.adm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.adm.PedidoAdm;
import com.evolution.repository.adm.PedidoAdmRepository;

@Service
public class PedidoAdmService {

	@Autowired
	private PedidoAdmRepository repository;

	@Transactional
	public PedidoAdm create(PedidoAdm pedido) {
		PedidoAdm salvo = repository.save(pedido);
		return salvo;
	}

	@Transactional
	public PedidoAdm update(Long id, PedidoAdm pedido) {
		
		findById(id);
		
		return repository.save(pedido);
	}

	@Transactional
	public void delete(Long id) {
		PedidoAdm salvo = findById(id);
		repository.delete(salvo);
	}

	public PedidoAdm findById(Long id) {
		PedidoAdm salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}

}
