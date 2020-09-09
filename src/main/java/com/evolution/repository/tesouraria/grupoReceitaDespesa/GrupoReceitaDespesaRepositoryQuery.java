package com.evolution.repository.tesouraria.grupoReceitaDespesa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.GrupoReceitaDespesaFilter;
import com.evolution.repository.tesouraria.projection.GrupoReceitaDespesaResumo;

public interface GrupoReceitaDespesaRepositoryQuery {

	public Page<GrupoReceitaDespesaResumo> resumir(GrupoReceitaDespesaFilter filter, Pageable pageable);

}
