package com.evolution.service.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Motorista;
import com.evolution.repository.cadastro.MotoristaRepository;

@Service
public class MotoristaService {

	@Autowired
	private MotoristaRepository repository;

	@Transactional
	public Motorista create(Motorista veiculo) {
		Motorista salvo = repository.save(veiculo);
		return salvo;
	}

	@Transactional
	public Motorista update(Long id, Motorista motorista) {
		
		findById(id);
		
		return repository.save(motorista);
	}

	@Transactional
	public void delete(Long id) {
		Motorista salvo = findById(id);
		repository.delete(salvo);
	}

	public Motorista findById(Long id) {
		Motorista salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
