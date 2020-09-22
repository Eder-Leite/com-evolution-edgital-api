package com.evolution.service.livro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.AliquotaUF;
import com.evolution.repository.livro.AliquotaUFRepository;

@Service
public class AliquotaUFService {

	@Autowired
	private AliquotaUFRepository repository;

	@Transactional
	public AliquotaUF create(AliquotaUF aliquotaUF) {
		AliquotaUF salvo = repository.save(aliquotaUF);
		return salvo;
	}

	@Transactional
	public AliquotaUF update(Long id, AliquotaUF aliquotaUF) {
		
		findById(id);
		
		return repository.save(aliquotaUF);
	}

	@Transactional
	public void delete(Long id) {
		AliquotaUF salvo = findById(id);
		repository.delete(salvo);
	}

	public AliquotaUF findById(Long id) {
		AliquotaUF salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
