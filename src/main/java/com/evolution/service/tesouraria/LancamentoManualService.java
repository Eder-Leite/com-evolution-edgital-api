package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.LancamentoManual;
import com.evolution.repository.tesouraria.LancamentoManualRepository;

@Service
public class LancamentoManualService {

	@Autowired
	private LancamentoManualRepository repository;

	@Transactional
	public LancamentoManual create(LancamentoManual lancamentoManual) {
		LancamentoManual salvo = repository.save(lancamentoManual);
		return salvo;
	}

	@Transactional
	public LancamentoManual update(Long id, LancamentoManual lancamentoManual) {
		LancamentoManual salvo = findById(id);

		//BeanUtils.copyProperties(lancamentoManual, salvo, "id");
		return repository.save(lancamentoManual);
	}

	@Transactional
	public void delete(Long id) {
		LancamentoManual salvo = findById(id);
		repository.delete(salvo);
	}

	public LancamentoManual findById(Long id) {
		LancamentoManual salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}
