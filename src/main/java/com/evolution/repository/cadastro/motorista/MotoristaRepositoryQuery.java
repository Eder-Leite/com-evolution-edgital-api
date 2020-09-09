package com.evolution.repository.cadastro.motorista;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.cadastro.filter.MotoristaFilter;
import com.evolution.repository.cadastro.projection.MotoristaResumo;

public interface MotoristaRepositoryQuery {

	public Page<MotoristaResumo> resumir(MotoristaFilter filter, Pageable pageable);

}
