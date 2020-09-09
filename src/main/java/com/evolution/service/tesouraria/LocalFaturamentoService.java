package com.evolution.service.tesouraria;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.LocalFaturamento;
import com.evolution.repository.tesouraria.LocalFaturamentoRepository;

@Service
public class LocalFaturamentoService {

	@Autowired
	private LocalFaturamentoRepository repository;

	@Transactional
	public LocalFaturamento create(LocalFaturamento localFaturamento) {
		LocalFaturamento salvo = repository.save(localFaturamento);
		return salvo;
	}

	@Transactional
	public LocalFaturamento update(Long id, LocalFaturamento localFaturamento) {
		LocalFaturamento salvo = findById(id);

		BeanUtils.copyProperties(localFaturamento, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		LocalFaturamento salvo = findById(id);
		repository.delete(salvo);
	}

	public LocalFaturamento findById(Long id) {
		LocalFaturamento salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}
