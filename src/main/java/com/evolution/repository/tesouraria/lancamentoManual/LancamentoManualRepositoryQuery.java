package com.evolution.repository.tesouraria.lancamentoManual;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.LancamentoManualFilter;
import com.evolution.repository.tesouraria.projection.LancamentoManualResumo;

public interface LancamentoManualRepositoryQuery {

	public Page<LancamentoManualResumo> resumir(LancamentoManualFilter filter, Pageable pageable);

}
