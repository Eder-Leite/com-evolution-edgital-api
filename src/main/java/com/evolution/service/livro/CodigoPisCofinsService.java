package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.CodigoPisCofins;
import com.evolution.repository.livro.CodigoPisCofinsRepository;

@Service
public class CodigoPisCofinsService {

	@Autowired
	private CodigoPisCofinsRepository repository;

	@Transactional
	public CodigoPisCofins create(CodigoPisCofins codigoPisCofins) {
		CodigoPisCofins salvo = repository.save(codigoPisCofins);
		return salvo;
	}

	@Transactional
	public CodigoPisCofins update(Long id, CodigoPisCofins codigoPisCofins) {
		
		findById(id);
		
		return repository.save(codigoPisCofins);
	}

	@Transactional
	public void delete(Long id) {
		CodigoPisCofins salvo = findById(id);
		repository.delete(salvo);
	}

	public CodigoPisCofins findById(Long id) {
		CodigoPisCofins salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
