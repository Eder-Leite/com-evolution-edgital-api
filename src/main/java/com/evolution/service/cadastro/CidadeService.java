package com.evolution.service.cadastro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Cidade;
import com.evolution.repository.cadastro.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repository;

	@Transactional
	public Cidade create(Cidade cidade) {
		Cidade salvo = repository.save(cidade);
		return salvo;
	}

	@Transactional
	public Cidade update(Long id, Cidade cidade) {
		Cidade salvo = findById(id);

		BeanUtils.copyProperties(cidade, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Cidade salvo = findById(id);
		repository.delete(salvo);
	}

	public Cidade findById(Long id) {
		Cidade salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}
