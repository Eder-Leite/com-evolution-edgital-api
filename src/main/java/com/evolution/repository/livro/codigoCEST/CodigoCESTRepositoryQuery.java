package com.evolution.repository.livro.codigoCEST;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.CodigoCESTFilter;
import com.evolution.repository.livro.projection.CodigoCESTResumo;;

public interface CodigoCESTRepositoryQuery {

	public Page<CodigoCESTResumo> resumir(CodigoCESTFilter filter, Pageable pageable);

}
