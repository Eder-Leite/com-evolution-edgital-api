package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.GrupoReceitaDespesa;
import com.evolution.repository.tesouraria.GrupoReceitaDespesaRepository;

@Service
public class GrupoReceitaDespesaService {

	@Autowired
	private GrupoReceitaDespesaRepository repository;

	@Transactional
	public GrupoReceitaDespesa create(GrupoReceitaDespesa grupoReceitaDespesa) {
		GrupoReceitaDespesa salvo = repository.save(grupoReceitaDespesa);
		return salvo;
	}

	@Transactional
	public GrupoReceitaDespesa update(Long id, GrupoReceitaDespesa grupoReceitaDespesa) {
		
		findById(id);
		
		return repository.save(grupoReceitaDespesa);
	}

	@Transactional
	public void delete(Long id) {
		GrupoReceitaDespesa salvo = findById(id);
		repository.delete(salvo);
	}

	public GrupoReceitaDespesa findById(Long id) {
		GrupoReceitaDespesa salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
