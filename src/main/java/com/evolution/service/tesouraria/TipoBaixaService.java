package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.TipoBaixa;
import com.evolution.repository.tesouraria.TipoBaixaRepository;

@Service
public class TipoBaixaService {

	@Autowired
	private TipoBaixaRepository repository;

	@Transactional
	public TipoBaixa create(TipoBaixa tipoBaixa) {
		TipoBaixa salvo = repository.save(tipoBaixa);
		return salvo;
	}

	@Transactional
	public TipoBaixa update(Long id, TipoBaixa tipoBaixa) {
		
		findById(id);
		
		return repository.save(tipoBaixa);
	}

	@Transactional
	public void delete(Long id) {
		TipoBaixa salvo = findById(id);
		repository.delete(salvo);
	}

	public TipoBaixa findById(Long id) {
		TipoBaixa salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
