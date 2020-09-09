package com.evolution.repository.tesouraria.talaoCheque;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.TalaoChequeFilter;
import com.evolution.repository.tesouraria.projection.TalaoChequeResumo;

public interface TalaoChequeRepositoryQuery {

	public Page<TalaoChequeResumo> resumir(TalaoChequeFilter filter, Pageable pageable);

}
