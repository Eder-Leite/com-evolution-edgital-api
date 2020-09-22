package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.CodigoAjusteICMS;
import com.evolution.repository.livro.CodigoAjusteICMSRepository;

@Service
public class CodigoAjusteICMSService {

	@Autowired
	private CodigoAjusteICMSRepository repository;

	@Transactional
	public CodigoAjusteICMS create(CodigoAjusteICMS codigoAjusteICMS) {
		CodigoAjusteICMS salvo = repository.save(codigoAjusteICMS);
		return salvo;
	}

	@Transactional
	public CodigoAjusteICMS update(Long id, CodigoAjusteICMS codigoAjusteICMS) {
		
		findById(id);
		
		return repository.save(codigoAjusteICMS);
	}

	@Transactional
	public void delete(Long id) {
		CodigoAjusteICMS salvo = findById(id);
		repository.delete(salvo);
	}

	public CodigoAjusteICMS findById(Long id) {
		CodigoAjusteICMS salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
