package com.evolution.service.livro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.MovimentoLiv;
import com.evolution.repository.livro.MovimentoLivRepository;

@Service
public class MovimentoLivService {

	@Autowired
	private MovimentoLivRepository repository;

	@Transactional
	public MovimentoLiv create(MovimentoLiv movimento) {
		MovimentoLiv salvo = repository.save(movimento);
		return salvo;
	}

	@Transactional
	public MovimentoLiv update(Long id, MovimentoLiv movimento) {
		MovimentoLiv salvo = findById(id);

		BeanUtils.copyProperties(movimento, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		MovimentoLiv salvo = findById(id);
		repository.delete(salvo);
	}

	public MovimentoLiv findById(Long id) {
		MovimentoLiv salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
