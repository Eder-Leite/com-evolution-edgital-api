package com.evolution.repository.cadastro.cidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.cadastro.filter.CidadeFilter;
import com.evolution.repository.cadastro.projection.CidadeResumo;

public interface CidadeRepositoryQuery {

	public Page<CidadeResumo> resumir(CidadeFilter filter, Pageable pageable);

}
