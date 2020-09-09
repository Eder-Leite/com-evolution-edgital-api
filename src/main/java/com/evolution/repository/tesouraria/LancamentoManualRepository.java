package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.LancamentoManual;
import com.evolution.repository.tesouraria.lancamentoManual.LancamentoManualRepositoryQuery;

@Repository
public interface LancamentoManualRepository
		extends JpaRepository<LancamentoManual, Long>, LancamentoManualRepositoryQuery {

}
