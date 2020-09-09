package com.evolution.service.livro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.livro.AliquotaIPI;
import com.evolution.repository.livro.AliquotaIPIRepository;

@Service
public class AliquotaIPIService {

	@Autowired
	private AliquotaIPIRepository repository;

	@Transactional
	public AliquotaIPI create(AliquotaIPI aliquotaIPI) {
		AliquotaIPI salvo = repository.save(aliquotaIPI);
		return salvo;
	}

	@Transactional
	public AliquotaIPI update(Long id, AliquotaIPI aliquotaIPI) {
		AliquotaIPI salvo = findById(id);

		BeanUtils.copyProperties(aliquotaIPI, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		AliquotaIPI salvo = findById(id);
		repository.delete(salvo);
	}

	public AliquotaIPI findById(Long id) {
		AliquotaIPI salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}

}
