package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.HistoricoBancario;
import com.evolution.repository.tesouraria.HistoricoBancarioRepository;

@Service
public class HistoricoBancarioService {

	@Autowired
	private HistoricoBancarioRepository repository;

	@Transactional
	public HistoricoBancario create(HistoricoBancario historicoBancario) {
		HistoricoBancario salvo = repository.save(historicoBancario);
		return salvo;
	}

	@Transactional
	public HistoricoBancario update(Long id, HistoricoBancario historicoBancario) {
		HistoricoBancario salvo = findById(id);

		BeanUtils.copyProperties(historicoBancario, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		HistoricoBancario salvo = findById(id);
		repository.delete(salvo);
	}

	public HistoricoBancario findById(Long id) {
		HistoricoBancario salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}
}
