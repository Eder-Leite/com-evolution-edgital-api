package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.Titulo;
import com.evolution.repository.tesouraria.TituloRepository;

@Service
public class TituloService {

	@Autowired
	private TituloRepository repository;

	@Transactional
	public Titulo create(Titulo titulo) {
		Titulo salvo = repository.save(titulo);
		return salvo;
	}

	@Transactional
	public Titulo update(Long id, Titulo titulo) {
		
		findById(id);
		
		return repository.save(titulo);
	}

	@Transactional
	public void delete(Long id) {
		Titulo salvo = findById(id);
		repository.delete(salvo);
	}

	public Titulo findById(Long id) {
		Titulo salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
