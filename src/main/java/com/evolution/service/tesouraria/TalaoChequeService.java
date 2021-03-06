package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.TalaoCheque;
import com.evolution.repository.tesouraria.TalaoChequeRepository;

@Service
public class TalaoChequeService {

	@Autowired
	private TalaoChequeRepository repository;

	@Transactional
	public TalaoCheque create(TalaoCheque talaoCheque) {
		TalaoCheque salvo = repository.save(talaoCheque);
		return salvo;
	}

	@Transactional
	public TalaoCheque update(Long id, TalaoCheque talaoCheque) {
		
		findById(id);
		
		return repository.save(talaoCheque);
	}

	@Transactional
	public void delete(Long id) {
		TalaoCheque salvo = findById(id);
		repository.delete(salvo);
	}

	public TalaoCheque findById(Long id) {
		TalaoCheque salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
