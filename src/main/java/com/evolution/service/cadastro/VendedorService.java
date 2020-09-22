package com.evolution.service.cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Vendedor;
import com.evolution.repository.cadastro.VendedorRepository;

@Service
public class VendedorService {

	@Autowired
	private VendedorRepository repository;

	@Transactional
	public Vendedor create(Vendedor vendedor) {
		Vendedor salvo = repository.save(vendedor);
		return salvo;
	}

	@Transactional
	public Vendedor update(Long id, Vendedor vendedor) {
		
		findById(id);
		
		return repository.save(vendedor);
	}

	@Transactional
	public void delete(Long id) {
		Vendedor salvo = findById(id);
		repository.delete(salvo);
	}

	public Vendedor findById(Long id) {
		Vendedor salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
