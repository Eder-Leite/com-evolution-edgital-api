package com.evolution.repository.livro.finalidade;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.FinalidadeFilter;
import com.evolution.repository.livro.projection.FinalidadeResumo;

public interface FinalidadeRepositoryQuery {

	public Page<FinalidadeResumo> resumir(FinalidadeFilter filter, Pageable pageable);

}
