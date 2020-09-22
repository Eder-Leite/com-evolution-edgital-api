package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.Modelo;
import com.evolution.repository.livro.ModeloRepository;

@Service
public class ModeloService {

	@Autowired
	private ModeloRepository repository;

	@Transactional
	public Modelo create(Modelo modelo) {
		Modelo salvo = repository.save(modelo);
		return salvo;
	}

	@Transactional
	public Modelo update(Long id, Modelo modelo) {
		
		findById(id);
		
		return repository.save(modelo);
	}

	@Transactional
	public void delete(Long id) {
		Modelo salvo = findById(id);
		repository.delete(salvo);
	}

	public Modelo findById(Long id) {
		Modelo salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
