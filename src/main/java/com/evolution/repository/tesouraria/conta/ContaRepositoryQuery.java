package com.evolution.repository.tesouraria.conta;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.ContaFilter;
import com.evolution.repository.tesouraria.projection.ContaResumo;

public interface ContaRepositoryQuery {

	public Page<ContaResumo> resumir(ContaFilter filter, Pageable pageable);

}
