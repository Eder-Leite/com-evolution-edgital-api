package com.evolution.repository.livro.codigoANP;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.CodigoANPFilter;
import com.evolution.repository.livro.projection.CodigoANPResumo;

public interface CodigoANPRepositoryQuery {

	public Page<CodigoANPResumo> resumir(CodigoANPFilter filter, Pageable pageable);

}
