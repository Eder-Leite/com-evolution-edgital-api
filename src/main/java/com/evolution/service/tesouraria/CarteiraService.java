package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.Carteira;
import com.evolution.repository.tesouraria.CarteiraRepository;

@Service
public class CarteiraService {

	@Autowired
	private CarteiraRepository repository;

	@Transactional
	public Carteira create(Carteira carteira) {
		Carteira salvo = repository.save(carteira);
		return salvo;
	}

	@Transactional
	public Carteira update(Long id, Carteira carteira) {
		Carteira salvo = findById(id);

		BeanUtils.copyProperties(carteira, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Carteira salvo = findById(id);
		repository.delete(salvo);
	}

	public Carteira findById(Long id) {
		Carteira salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
