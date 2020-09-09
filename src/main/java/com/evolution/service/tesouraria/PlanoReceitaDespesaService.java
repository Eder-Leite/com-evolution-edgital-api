package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.PlanoReceitaDespesa;
import com.evolution.repository.tesouraria.PlanoReceitaDespesaRepository;

@Service
public class PlanoReceitaDespesaService {

	@Autowired
	private PlanoReceitaDespesaRepository repository;

	@Transactional
	public PlanoReceitaDespesa create(PlanoReceitaDespesa planoReceitaDespesa) {
		PlanoReceitaDespesa salvo = repository.save(planoReceitaDespesa);
		return salvo;
	}

	@Transactional
	public PlanoReceitaDespesa update(Long id, PlanoReceitaDespesa planoReceitaDespesa) {
		PlanoReceitaDespesa salvo = findById(id);

		BeanUtils.copyProperties(planoReceitaDespesa, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		PlanoReceitaDespesa salvo = findById(id);
		repository.delete(salvo);
	}

	public PlanoReceitaDespesa findById(Long id) {
		PlanoReceitaDespesa salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
