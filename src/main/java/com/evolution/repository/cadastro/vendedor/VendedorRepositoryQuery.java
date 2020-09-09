package com.evolution.repository.cadastro.vendedor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.cadastro.filter.VendedorFilter;
import com.evolution.repository.cadastro.projection.VendedorResumo;

public interface VendedorRepositoryQuery {

	public Page<VendedorResumo> resumir(VendedorFilter filter, Pageable pageable);

}
