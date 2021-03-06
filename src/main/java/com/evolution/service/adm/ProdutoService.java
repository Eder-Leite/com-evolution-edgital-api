package com.evolution.service.adm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.adm.Produto;
import com.evolution.repository.adm.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;

	@Transactional
	public Produto create(Produto produto) {
		Produto salvo = repository.save(produto);
		return salvo;
	}

	@Transactional
	public Produto update(Long id, Produto produto) {
		
		findById(id);
		
		return repository.save(produto);
	}

	@Transactional
	public void delete(Long id) {
		Produto salvo = findById(id);
		repository.delete(salvo);
	}

	public Produto findById(Long id) {
		Produto salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
