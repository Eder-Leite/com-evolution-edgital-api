package com.evolution.repository.tesouraria.planoReceitaDespesa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.PlanoReceitaDespesaFilter;
import com.evolution.repository.tesouraria.projection.PlanoReceitaDespesaResumo;

public interface PlanoReceitaDespesaRepositoryQuery {

	public Page<PlanoReceitaDespesaResumo> resumir(PlanoReceitaDespesaFilter filter, Pageable pageable);

}
