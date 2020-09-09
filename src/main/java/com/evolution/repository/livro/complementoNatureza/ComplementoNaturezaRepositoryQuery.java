package com.evolution.repository.livro.complementoNatureza;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.ComplementoNaturezaFilter;
import com.evolution.repository.livro.projection.ComplementoNaturezaResumo;

public interface ComplementoNaturezaRepositoryQuery {

	public Page<ComplementoNaturezaResumo> resumir(ComplementoNaturezaFilter filter, Pageable pageable);

}
