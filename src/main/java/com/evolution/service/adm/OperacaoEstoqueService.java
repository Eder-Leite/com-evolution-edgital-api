package com.evolution.service.adm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.adm.OperacaoEstoque;
import com.evolution.repository.adm.OperacaoEstoqueRepository;

@Service
public class OperacaoEstoqueService {

	@Autowired
	private OperacaoEstoqueRepository repository;

	@Transactional
	public OperacaoEstoque create(OperacaoEstoque operacaoEstoque) {
		OperacaoEstoque salvo = repository.save(operacaoEstoque);
		return salvo;
	}

	@Transactional
	public OperacaoEstoque update(Long id, OperacaoEstoque operacaoEstoque) {
		
		findById(id);
		
		return repository.save(operacaoEstoque);
	}

	@Transactional
	public void delete(Long id) {
		OperacaoEstoque salvo = findById(id);
		repository.delete(salvo);
	}

	public OperacaoEstoque findById(Long id) {
		OperacaoEstoque salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
