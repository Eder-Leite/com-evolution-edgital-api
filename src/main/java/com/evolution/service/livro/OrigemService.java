package com.evolution.service.livro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.Origem;
import com.evolution.repository.livro.OrigemRepository;

@Service
public class OrigemService {

	@Autowired
	private OrigemRepository repository;

	@Transactional
	public Origem create(Origem origem) {
		Origem salvo = repository.save(origem);
		return salvo;
	}

	@Transactional
	public Origem update(Long id, Origem origem) {
		Origem salvo = findById(id);

		BeanUtils.copyProperties(origem, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Origem salvo = findById(id);
		repository.delete(salvo);
	}

	public Origem findById(Long id) {
		Origem salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
