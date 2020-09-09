package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.Banco;
import com.evolution.repository.tesouraria.BancoRepository;

@Service
public class BancoService {

	@Autowired
	private BancoRepository repository;

	@Transactional
	public Banco create(Banco banco) {
		Banco salvo = repository.save(banco);
		return salvo;
	}

	@Transactional
	public Banco update(Long id, Banco banco) {
		Banco salvo = findById(id);

		BeanUtils.copyProperties(banco, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Banco salvo = findById(id);
		repository.delete(salvo);
	}

	public Banco findById(Long id) {
		Banco salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}
