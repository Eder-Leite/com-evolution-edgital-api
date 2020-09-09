package com.evolution.repository.cadastro.estado;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.cadastro.filter.EstadoFilter;
import com.evolution.repository.cadastro.projection.EstadoResumo;

public interface EstadoRepositoryQuery {

	public Page<EstadoResumo> resumir(EstadoFilter filter, Pageable pageable);

}
