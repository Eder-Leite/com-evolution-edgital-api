package com.evolution.service.livro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.ComentarioFiscal;
import com.evolution.repository.livro.ComentarioFiscalRepository;

@Service
public class ComentarioFiscalService {

	@Autowired
	private ComentarioFiscalRepository repository;

	@Transactional
	public ComentarioFiscal create(ComentarioFiscal comentarioFiscal) {
		ComentarioFiscal salvo = repository.save(comentarioFiscal);
		return salvo;
	}

	@Transactional
	public ComentarioFiscal update(Long id, ComentarioFiscal comentarioFiscal) {
		ComentarioFiscal salvo = findById(id);

		BeanUtils.copyProperties(comentarioFiscal, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		ComentarioFiscal salvo = findById(id);
		repository.delete(salvo);
	}

	public ComentarioFiscal findById(Long id) {
		ComentarioFiscal salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}
