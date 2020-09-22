package com.evolution.service.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.seguranca.Permissao;
import com.evolution.repository.seguranca.PermissaoRepository;

@Service
public class PermissaoService {

	@Autowired
	private PermissaoRepository repository;

	@Transactional
	public Permissao create(Permissao permissao) {
		Permissao salvo = repository.save(permissao);
		return salvo;
	}

	@Transactional
	public Permissao update(Long id, Permissao permissao) {
		
		findById(id);
		
		return repository.save(permissao);
	}

	@Transactional
	public void delete(Long id) {
		Permissao salvo = findById(id);
		repository.delete(salvo);
	}

	public Permissao findById(Long id) {
		Permissao salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
