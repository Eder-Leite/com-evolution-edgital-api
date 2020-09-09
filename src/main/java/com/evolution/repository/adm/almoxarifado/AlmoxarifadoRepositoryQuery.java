package com.evolution.repository.adm.almoxarifado;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.adm.filter.AlmoxarifadoFilter;
import com.evolution.repository.adm.projection.AlmoxarifadoResumo;

public interface AlmoxarifadoRepositoryQuery {

	public Page<AlmoxarifadoResumo> resumir(AlmoxarifadoFilter filter, Pageable pageable);

}
