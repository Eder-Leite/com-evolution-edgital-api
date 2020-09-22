package com.evolution.service.tesouraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.Cheque;
import com.evolution.model.tesouraria.enumerador.SituacaoCheque;
import com.evolution.repository.tesouraria.ChequeRepository;

@Service
public class ChequeService {

	@Autowired
	private ChequeRepository repository;

	@Transactional
	public Cheque create(Cheque cheque) {
		Cheque salvo = repository.save(cheque);
		return salvo;
	}

	@Transactional
	public Cheque update(Long id, Cheque cheque) {
		
		findById(id);
		
		return repository.save(cheque);
	}

	@Transactional
	public void delete(Long id) {
		Cheque salvo = findById(id);
		repository.delete(salvo);
	}

	public void recuperaCheque(Long id) {
		Cheque salvo = findById(id);

		salvo.setDataEmissao(null);
		salvo.setDataMovimento(null);
		salvo.setNominal(null);
		salvo.setValor(null);
		salvo.setSituacao(SituacaoCheque.ATIVO);

		update(id, salvo);
	}

	public void inutilizaCheque(Long id) {
		Cheque salvo = findById(id);

		salvo.setDataEmissao(null);
		salvo.setDataMovimento(null);
		salvo.setNominal(null);
		salvo.setValor(null);
		salvo.setSituacao(SituacaoCheque.CANCELADO);

		update(id, salvo);
	}

	public Cheque findById(Long id) {
		Cheque salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}
}
