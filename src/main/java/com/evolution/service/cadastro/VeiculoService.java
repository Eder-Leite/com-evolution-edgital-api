package com.evolution.service.cadastro;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.cadastro.Veiculo;
import com.evolution.repository.cadastro.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;

	@Transactional
	public Veiculo create(Veiculo veiculo) {
		Veiculo salvo = repository.save(veiculo);
		return salvo;
	}

	@Transactional
	public Veiculo update(Long id, Veiculo veiculo) {
		Veiculo salvo = findById(id);

		BeanUtils.copyProperties(veiculo, salvo, "id");
		return repository.save(salvo);
	}

	@Transactional
	public void delete(Long id) {
		Veiculo salvo = findById(id);
		repository.delete(salvo);
	}

	public Veiculo findById(Long id) {
		Veiculo salvo = repository.findOne(id);
		if (salvo == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return salvo;
	}
}
