package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.TipoPagamento;
import com.evolution.repository.tesouraria.TipoPagamentoRepository;

@Service
public class TipoPagamentoService {

	@Autowired
	private TipoPagamentoRepository repository;

	@Transactional
	public TipoPagamento create(TipoPagamento tipoPagamento) {
		TipoPagamento salvo = repository.save(tipoPagamento);
		return salvo;
	}

	@Transactional
	public TipoPagamento update(Long id, TipoPagamento tipoPagamento) {
		TipoPagamento salvo = findById(id);

		BeanUtils.copyProperties(tipoPagamento, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		TipoPagamento salvo = findById(id);
		repository.delete(salvo);
	}

	public TipoPagamento findById(Long id) {
		TipoPagamento salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}
}
