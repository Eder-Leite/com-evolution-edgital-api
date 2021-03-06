package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.MovimentoTes;
import com.evolution.repository.tesouraria.MovimentoTesRepository;

@Service
public class MovimentoTesService {

	@Autowired
	private MovimentoTesRepository repository;

	@Transactional
	public MovimentoTes create(MovimentoTes movimento) {
		MovimentoTes salvo = repository.save(movimento);
		return salvo;
	}

	@Transactional
	public MovimentoTes update(Long id, MovimentoTes movimento) {
		
		findById(id);
		
		return repository.save(movimento);
	}

	@Transactional
	public void delete(Long id) {
		MovimentoTes salvo = findById(id);
		repository.delete(salvo);
	}

	public MovimentoTes findById(Long id) {
		MovimentoTes salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
