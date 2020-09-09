package com.evolution.service.adm;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.adm.Almoxarifado;
import com.evolution.repository.adm.AlmoxarifadoRepository;

@Service
public class AlmoxarifadoService {

	@Autowired
	private AlmoxarifadoRepository repository;

	@Transactional
	public Almoxarifado create(Almoxarifado almoxarifado) {
		Almoxarifado salvo = repository.save(almoxarifado);
		return salvo;
	}

	@Transactional
	public Almoxarifado update(Long id, Almoxarifado almoxarifado) {
		Almoxarifado salvo = findById(id);

		BeanUtils.copyProperties(almoxarifado, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Almoxarifado salvo = findById(id);
		repository.delete(salvo);
	}

	public Almoxarifado findById(Long id) {
		Almoxarifado salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
