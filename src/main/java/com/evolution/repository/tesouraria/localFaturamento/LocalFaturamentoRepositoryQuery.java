package com.evolution.repository.tesouraria.localFaturamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.LocalFaturamentoFilter;
import com.evolution.repository.tesouraria.projection.LocalFaturamentoResumo;

public interface LocalFaturamentoRepositoryQuery {

	public Page<LocalFaturamentoResumo> resumir(LocalFaturamentoFilter filter, Pageable pageable);

}
