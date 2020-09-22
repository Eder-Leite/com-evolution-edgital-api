package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.Origem;
import com.evolution.repository.livro.OrigemRepository;

@Service
public class OrigemService {

	@Autowired
	private OrigemRepository repository;

	@Transactional
	public Origem create(Origem origem) {
		Origem salvo = repository.save(origem);
		return salvo;
	}

	@Transactional
	public Origem update(Long id, Origem origem) {
		
		findById(id);
		
		return repository.save(origem);
	}

	@Transactional
	public void delete(Long id) {
		Origem salvo = findById(id);
		repository.delete(salvo);
	}

	public Origem findById(Long id) {
		Origem salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
