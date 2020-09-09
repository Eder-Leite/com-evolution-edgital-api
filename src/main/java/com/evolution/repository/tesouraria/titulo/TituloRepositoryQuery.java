package com.evolution.repository.tesouraria.titulo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.TituloFilter;
import com.evolution.repository.tesouraria.projection.TituloResumo;

public interface TituloRepositoryQuery {

	public Page<TituloResumo> resumir(TituloFilter filter, Pageable pageable);

}
