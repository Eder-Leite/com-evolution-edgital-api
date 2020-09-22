package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.Baixa;
import com.evolution.repository.tesouraria.BaixaRepository;

@Service
public class BaixaService {

	@Autowired
	private BaixaRepository repository;

	@Transactional
	public Baixa create(Baixa baixa) {
		Baixa salvo = repository.save(baixa);
		return salvo;
	}

	@Transactional
	public Baixa update(Long id, Baixa baixa) {
		
		findById(id);
		
		return repository.save(baixa);
	}

	@Transactional
	public void delete(Long id) {
		Baixa salvo = findById(id);
		repository.delete(salvo);
	}

	public Baixa findById(Long id) {
		Baixa salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
