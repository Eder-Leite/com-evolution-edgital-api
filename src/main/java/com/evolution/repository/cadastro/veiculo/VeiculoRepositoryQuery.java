package com.evolution.repository.cadastro.veiculo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.cadastro.filter.VeiculoFilter;
import com.evolution.repository.cadastro.projection.VeiculoResumo;

public interface VeiculoRepositoryQuery {

	public Page<VeiculoResumo> resumir(VeiculoFilter filter, Pageable pageable);

}
