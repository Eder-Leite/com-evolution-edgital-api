package com.evolution.service.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Empresa;
import com.evolution.repository.cadastro.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repository;

	@Transactional
	public Empresa create(Empresa empresa) {
		Empresa salvo = repository.save(empresa);
		return salvo;
	}

	@Transactional
	public Empresa update(Long id, Empresa empresa) {
		
		findById(id);
		
		return repository.save(empresa);
	}

	@Transactional
	public void delete(Long id) {
		Empresa salvo = findById(id);
		repository.delete(salvo);
	}

	public Empresa findById(Long id) {
		Empresa salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}

}
