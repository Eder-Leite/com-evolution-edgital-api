package com.evolution.service.seguranca;

import org.springframework.beans.BeanUtils;
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
		Permissao salvo = findById(id);

		BeanUtils.copyProperties(permissao, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Permissao salvo = findById(id);
		repository.delete(salvo);
	}

	public Permissao findById(Long id) {
		Permissao salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}
}
