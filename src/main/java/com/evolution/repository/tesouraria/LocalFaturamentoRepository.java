package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.LocalFaturamento;
import com.evolution.repository.tesouraria.localFaturamento.LocalFaturamentoRepositoryQuery;

@Repository
public interface LocalFaturamentoRepository
		extends JpaRepository<LocalFaturamento, Long>, LocalFaturamentoRepositoryQuery {

}
