package com.evolution.repository.cadastro.cadastro;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.cadastro.filter.CadastroFilter;
import com.evolution.repository.cadastro.projection.CadastroResumo;

public interface CadastroRepositoryQuery {

	public Page<CadastroResumo> resumir(CadastroFilter filter, Pageable pageable);

}
