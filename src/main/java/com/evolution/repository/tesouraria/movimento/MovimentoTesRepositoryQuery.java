package com.evolution.repository.tesouraria.movimento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.MovimentoFilter;
import com.evolution.repository.tesouraria.projection.MovimentoResumo;

public interface MovimentoTesRepositoryQuery {

	public Page<MovimentoResumo> resumir(MovimentoFilter filter, Pageable pageable);

}
