package com.evolution.service.livro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.AliquotaNCM;
import com.evolution.repository.livro.AliquotaNCMRepository;

@Service
public class AliquotaNCMService {

	@Autowired
	private AliquotaNCMRepository repository;

	@Transactional
	public AliquotaNCM create(AliquotaNCM aliquotaNCM) {
		AliquotaNCM salvo = repository.save(aliquotaNCM);
		return salvo;
	}

	@Transactional
	public AliquotaNCM update(Long id, AliquotaNCM aliquotaNCM) {
		AliquotaNCM salvo = findById(id);

		BeanUtils.copyProperties(aliquotaNCM, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		AliquotaNCM salvo = findById(id);
		repository.delete(salvo);
	}

	public AliquotaNCM findById(Long id) {
		AliquotaNCM salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;

	}

}
