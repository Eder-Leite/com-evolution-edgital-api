package com.evolution.service.livro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.CodigoANP;
import com.evolution.repository.livro.CodigoANPRepository;

@Service
public class CodigoANPService {

	@Autowired
	private CodigoANPRepository repository;

	@Transactional
	public CodigoANP create(CodigoANP codigoANP) {
		CodigoANP salvo = repository.save(codigoANP);
		return salvo;
	}

	@Transactional
	public CodigoANP update(Long id, CodigoANP codigoANP) {
		CodigoANP salvo = findById(id);

		BeanUtils.copyProperties(codigoANP, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		CodigoANP salvo = findById(id);
		repository.delete(salvo);
	}

	public CodigoANP findById(Long id) {
		CodigoANP salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
