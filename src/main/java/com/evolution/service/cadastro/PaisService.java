package com.evolution.service.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Pais;
import com.evolution.repository.cadastro.PaisRepository;

@Service
public class PaisService {

	@Autowired
	private PaisRepository repository;

	@Transactional
	public Pais create(Pais pais) {
		Pais salvo = repository.save(pais);
		return salvo;
	}

	@Transactional
	public Pais update(Long id, Pais pais) {
		
		findById(id);
		
		return repository.save(pais);
	}

	@Transactional
	public void delete(Long id) {
		Pais salvo = findById(id);
		repository.delete(salvo);
	}

	public Pais findById(Long id) {
		Pais salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
