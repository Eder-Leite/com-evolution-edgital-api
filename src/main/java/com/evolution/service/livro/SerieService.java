package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.Serie;
import com.evolution.repository.livro.SerieRepository;

@Service
public class SerieService {

	@Autowired
	private SerieRepository repository;

	@Transactional
	public Serie create(Serie serie) {
		Serie salvo = repository.save(serie);
		return salvo;
	}

	@Transactional
	public Serie update(Long id, Serie serie) {
		
		findById(id);
		
		return repository.save(serie);
	}

	@Transactional
	public void delete(Long id) {
		Serie salvo = findById(id);
		repository.delete(salvo);
	}

	public Serie findById(Long id) {
		Serie salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
