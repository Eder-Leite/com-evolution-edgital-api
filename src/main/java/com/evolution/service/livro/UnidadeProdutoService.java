package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.UnidadeProduto;
import com.evolution.repository.livro.UnidadeProdutoRepository;

@Service
public class UnidadeProdutoService {

	@Autowired
	private UnidadeProdutoRepository repository;

	@Transactional
	public UnidadeProduto create(UnidadeProduto unidadeProduto) {
		UnidadeProduto salvo = repository.save(unidadeProduto);
		return salvo;
	}

	@Transactional
	public UnidadeProduto update(Long id, UnidadeProduto unidadeProduto) {
		
		findById(id);
		
		return repository.save(unidadeProduto);
	}

	@Transactional
	public void delete(Long id) {
		UnidadeProduto salvo = findById(id);
		repository.delete(salvo);
	}

	public UnidadeProduto findById(Long id) {
		UnidadeProduto salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
