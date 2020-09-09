package com.evolution.service.cadastro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Estado;
import com.evolution.repository.cadastro.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repository;

	@Transactional
	public Estado create(Estado estado) {
		Estado salvo = repository.save(estado);
		return salvo;
	}

	@Transactional
	public Estado update(Long id, Estado estado) {
		Estado salvo = findById(id);

		BeanUtils.copyProperties(estado, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Estado salvo = findById(id);
		repository.delete(salvo);
	}

	public Estado findById(Long id) {
		Estado salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}
