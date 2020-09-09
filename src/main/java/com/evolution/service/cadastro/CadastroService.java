package com.evolution.service.cadastro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Cadastro;
import com.evolution.repository.cadastro.CadastroRepository;

@Service
public class CadastroService {

	@Autowired
	private CadastroRepository repository;

	@Transactional
	public Cadastro create(Cadastro cadastro) {
		Cadastro salvo = repository.save(cadastro);
		return salvo;
	}

	@Transactional
	public Cadastro update(Long id, Cadastro cadastro) {
		Cadastro salvo = findById(id);

		BeanUtils.copyProperties(cadastro, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Cadastro salvo = findById(id);
		repository.delete(salvo);
	}

	public Cadastro findById(Long id) {
		Cadastro salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
