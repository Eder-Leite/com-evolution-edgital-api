package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.Agencia;
import com.evolution.repository.tesouraria.AgenciaRepository;

@Service
public class AgenciaService {

	@Autowired
	private AgenciaRepository repository;

	@Transactional
	public Agencia create(Agencia agencia) {
		Agencia salvo = repository.save(agencia);
		return salvo;
	}

	@Transactional
	public Agencia update(Long id, Agencia agencia) {
		Agencia salvo = findById(id);

		BeanUtils.copyProperties(agencia, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Agencia salvo = findById(id);
		repository.delete(salvo);
	}

	public Agencia findById(Long id) {
		Agencia salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}