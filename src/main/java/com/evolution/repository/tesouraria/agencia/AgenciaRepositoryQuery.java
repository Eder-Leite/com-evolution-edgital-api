package com.evolution.repository.tesouraria.agencia;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.AgenciaFilter;
import com.evolution.repository.tesouraria.projection.AgenciaResumo;


public interface AgenciaRepositoryQuery {

	public Page<AgenciaResumo> resumir(AgenciaFilter filter, Pageable pageable);

}
