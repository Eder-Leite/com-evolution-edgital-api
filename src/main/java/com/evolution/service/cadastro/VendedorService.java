package com.evolution.service.cadastro;

import org.springframework.beans.BeanUtils;
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
		Vendedor salvo = findById(id);

		BeanUtils.copyProperties(vendedor, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Vendedor salvo = findById(id);
		repository.delete(salvo);
	}

	public Vendedor findById(Long id) {
		Vendedor salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}
}
