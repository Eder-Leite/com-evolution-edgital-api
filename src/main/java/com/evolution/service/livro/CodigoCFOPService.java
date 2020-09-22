package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.CodigoCFOP;
import com.evolution.repository.livro.CodigoCFOPRepository;

@Service
public class CodigoCFOPService {

	@Autowired
	private CodigoCFOPRepository repository;

	@Transactional
	public CodigoCFOP create(CodigoCFOP codigoCFOP) {
		CodigoCFOP salvo = repository.save(codigoCFOP);
		return salvo;
	}

	@Transactional
	public CodigoCFOP update(Long id, CodigoCFOP codigoCFOP) {
		
		findById(id);
		
		return repository.save(codigoCFOP);
	}

	@Transactional
	public void delete(Long id) {
		CodigoCFOP salvo = findById(id);
		repository.delete(salvo);
	}

	public CodigoCFOP findById(Long id) {
		CodigoCFOP salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
