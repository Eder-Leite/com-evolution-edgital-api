package com.evolution.repository.tesouraria.baixa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.BaixaFilter;
import com.evolution.repository.tesouraria.projection.BaixaResumo;

public interface BaixaRepositoryQuery {

	public Page<BaixaResumo> resumir(BaixaFilter filter, Pageable pageable);

}
