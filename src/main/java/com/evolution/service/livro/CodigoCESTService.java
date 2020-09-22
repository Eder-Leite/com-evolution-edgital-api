package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.CodigoCEST;
import com.evolution.repository.livro.CodigoCESTRepository;

@Service
public class CodigoCESTService {

	@Autowired
	private CodigoCESTRepository repository;

	@Transactional
	public CodigoCEST create(CodigoCEST codigoCEST) {
		CodigoCEST salvo = repository.save(codigoCEST);
		return salvo;
	}

	public CodigoCEST update(Long id, CodigoCEST codigoCEST) {
		
		findById(id);
		
		return repository.save(codigoCEST);
	}

	@Transactional
	public void delete(Long id) {
		CodigoCEST salvo = findById(id);
		repository.delete(salvo);
	}

	public CodigoCEST findById(Long id) {
		CodigoCEST salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
