package com.evolution.service.faturamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.faturamento.PedidoFat;
import com.evolution.repository.faturamento.PedidoFatRepository;

@Service
public class PedidoFatService {

	@Autowired
	private PedidoFatRepository repository;

	@Transactional
	public PedidoFat create(PedidoFat pedido) {
		PedidoFat salvo = repository.save(pedido);
		return salvo;
	}

	@Transactional
	public PedidoFat update(Long id, PedidoFat pedido) {
		
		findById(id);
		
		return repository.save(pedido);
	}

	@Transactional
	public void delete(Long id) {
		PedidoFat salvo = findById(id);
		repository.delete(salvo);
	}

	public PedidoFat findById(Long id) {
		PedidoFat salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
