package com.evolution.repository.livro.movimento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.MovimentoFilter;
import com.evolution.repository.livro.projection.MovimentoResumo;

public interface MovimentoLivRepositoryQuery {

	public Page<MovimentoResumo> resumir(MovimentoFilter filter, Pageable pageable);

}
