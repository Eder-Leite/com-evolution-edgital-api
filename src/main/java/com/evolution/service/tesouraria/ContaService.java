package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.Conta;
import com.evolution.repository.tesouraria.ContaRepository;

@Service
public class ContaService {

	@Autowired
	private ContaRepository repository;

	@Transactional
	public Conta create(Conta conta) {
		Conta salvo = repository.save(conta);
		return salvo;
	}

	@Transactional
	public Conta update(Long id, Conta conta) {
		
		findById(id);
		
		return repository.save(conta);
	}

	@Transactional
	public void delete(Long id) {
		Conta salvo = findById(id);
		repository.delete(salvo);
	}

	public Conta findById(Long id) {
		Conta salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
