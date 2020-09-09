package com.evolution.service.adm;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.adm.CategoriaProduto;
import com.evolution.repository.adm.CategoriaProdutoRepository;

@Service
public class CategoriaProdutoService {

	@Autowired
	private CategoriaProdutoRepository repository;

	@Transactional
	public CategoriaProduto create(CategoriaProduto categoriaProduto) {
		CategoriaProduto salvo = repository.save(categoriaProduto);
		return salvo;
	}

	@Transactional
	public CategoriaProduto update(Long id, CategoriaProduto categoriaProduto) {
		CategoriaProduto salvo = findById(id);

		BeanUtils.copyProperties(categoriaProduto, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		CategoriaProduto salvo = findById(id);
		repository.delete(salvo);
	}

	public CategoriaProduto findById(Long id) {
		CategoriaProduto salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
