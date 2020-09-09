package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.PlanoReceitaDespesa;
import com.evolution.repository.tesouraria.planoReceitaDespesa.PlanoReceitaDespesaRepositoryQuery;

@Repository
public interface PlanoReceitaDespesaRepository
		extends JpaRepository<PlanoReceitaDespesa, Long>, PlanoReceitaDespesaRepositoryQuery {

}
