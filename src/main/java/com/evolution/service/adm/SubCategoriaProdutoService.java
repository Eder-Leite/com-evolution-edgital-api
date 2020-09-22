package com.evolution.service.adm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.adm.SubCategoriaProduto;
import com.evolution.repository.adm.SubCategoriaProdutoRepository;

@Service
public class SubCategoriaProdutoService {

	@Autowired
	private SubCategoriaProdutoRepository repository;

	@Transactional
	public SubCategoriaProduto create(SubCategoriaProduto subCategoriaProduto) {
		SubCategoriaProduto salvo = repository.save(subCategoriaProduto);
		return salvo;
	}

	@Transactional
	public SubCategoriaProduto update(Long id, SubCategoriaProduto subCategoriaProduto) {
		
		findById(id);
		
		return repository.save(subCategoriaProduto);
	}

	@Transactional
	public void delete(Long id) {
		SubCategoriaProduto salvo = findById(id);
		repository.delete(salvo);
	}

	public SubCategoriaProduto findById(Long id) {
		SubCategoriaProduto salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}

}
