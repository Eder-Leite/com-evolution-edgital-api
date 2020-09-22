package com.evolution.service.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Filial;
import com.evolution.repository.cadastro.FilialRepository;

@Service
public class FilialService {

	@Autowired
	private FilialRepository repository;

	@Transactional
	public Filial create(Filial filial) {
		Filial salvo = repository.save(filial);
		return salvo;
	}

	@Transactional
	public Filial update(Long id, Filial filial) {
		
		findById(id);
		
		return repository.save(filial);
	}

	@Transactional
	public void delete(Long id) {
		Filial salvo = findById(id);
		repository.delete(salvo);
	}

	public Filial findById(Long id) {
		Filial salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
