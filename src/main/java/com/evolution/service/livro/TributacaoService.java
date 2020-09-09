package com.evolution.service.livro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.Tributacao;
import com.evolution.repository.livro.TributacaoRepository;

@Service
public class TributacaoService {

	@Autowired
	private TributacaoRepository repository;

	@Transactional
	public Tributacao create(Tributacao tributacao) {
		Tributacao salvo = repository.save(tributacao);
		return salvo;
	}

	@Transactional
	public Tributacao update(Long id, Tributacao tributacao) {
		Tributacao salvo = findById(id);

		BeanUtils.copyProperties(tributacao, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Tributacao salvo = findById(id);
		repository.delete(salvo);
	}

	public Tributacao findById(Long id) {
		Tributacao salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
