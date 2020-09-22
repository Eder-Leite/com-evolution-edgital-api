package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.ComplementoNatureza;
import com.evolution.repository.livro.ComplementoNaturezaRepository;

@Service
public class ComplementoNaturezaService {

	@Autowired
	private ComplementoNaturezaRepository repository;

	@Transactional
	public ComplementoNatureza create(ComplementoNatureza complementoNatureza) {
		ComplementoNatureza salvo = repository.save(complementoNatureza);
		return salvo;
	}

	@Transactional
	public ComplementoNatureza update(Long id, ComplementoNatureza complementoNatureza) {
		
		findById(id);
		
		return repository.save(complementoNatureza);
	}

	@Transactional
	public void delete(Long id) {
		ComplementoNatureza salvo = findById(id);
		repository.delete(salvo);
	}

	public ComplementoNatureza findById(Long id) {
		ComplementoNatureza salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
