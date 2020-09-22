package com.evolution.service.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Regiao;
import com.evolution.repository.cadastro.RegiaoRepository;

@Service
public class RegiaoService {

	@Autowired
	private RegiaoRepository repository;

	@Transactional
	public Regiao create(Regiao regiao) {
		Regiao salvo = repository.save(regiao);
		return salvo;
	}

	@Transactional
	public Regiao update(Long id, Regiao regiao) {
		
		findById(id);
		
		return repository.save(regiao);
	}

	@Transactional
	public void delete(Long id) {
		Regiao salvo = findById(id);
		repository.delete(salvo);
	}

	public Regiao findById(Long id) {
		Regiao salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
