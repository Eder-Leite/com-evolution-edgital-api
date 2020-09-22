package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.CodigoIPI;
import com.evolution.repository.livro.CodigoIPIRepository;

@Service
public class CodigoIPIService {

	@Autowired
	private CodigoIPIRepository repository;

	@Transactional
	public CodigoIPI create(CodigoIPI codigoIPI) {
		CodigoIPI salvo = repository.save(codigoIPI);
		return salvo;
	}

	@Transactional
	public CodigoIPI update(Long id, CodigoIPI codigoIPI) {
		
		findById(id);
		
		return repository.save(codigoIPI);
	}

	@Transactional
	public void delete(Long id) {
		CodigoIPI salvo = findById(id);
		repository.delete(salvo);
	}

	public CodigoIPI findById(Long id) {
		CodigoIPI salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
