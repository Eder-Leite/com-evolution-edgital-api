package com.evolution.repository.tesouraria.cheque;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.ChequeFilter;
import com.evolution.repository.tesouraria.projection.ChequeResumo;

public interface ChequeRepositoryQuery {

	public Page<ChequeResumo> resumir(ChequeFilter filter, Pageable pageable);

}
