package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.Tributacao;
import com.evolution.repository.livro.TributacaoRepository;

@Service
public class TributacaoService {

	@Autowired
	private TributacaoRepository repository;

	@Transactional
	public Tributacao create(Tributacao tributacao) {
		Tributacao salvo = repository.save(tributacao);
		return salvo;
	}

	@Transactional
	public Tributacao update(Long id, Tributacao tributacao) {
		
		findById(id);
		
		return repository.save(tributacao);
	}

	@Transactional
	public void delete(Long id) {
		Tributacao salvo = findById(id);
		repository.delete(salvo);
	}

	public Tributacao findById(Long id) {
		Tributacao salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
