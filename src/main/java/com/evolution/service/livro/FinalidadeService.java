package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.Finalidade;
import com.evolution.repository.livro.FinalidadeRepository;

@Service
public class FinalidadeService {

	@Autowired
	private FinalidadeRepository repository;

	@Transactional
	public Finalidade create(Finalidade finalidade) {
		Finalidade salvo = repository.save(finalidade);
		return salvo;
	}

	@Transactional
	public Finalidade update(Long id, Finalidade finalidade) {
		
		findById(id);
		
		return repository.save(finalidade);
	}

	@Transactional
	public void delete(Long id) {
		Finalidade salvo = findById(id);
		repository.delete(salvo);
	}

	public Finalidade findById(Long id) {
		Finalidade salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
