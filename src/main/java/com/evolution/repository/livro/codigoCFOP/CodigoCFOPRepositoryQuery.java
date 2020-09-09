package com.evolution.repository.livro.codigoCFOP;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.model.livro.CodigoCFOP;
import com.evolution.repository.livro.filter.CodigoCFOPFilter;

public interface CodigoCFOPRepositoryQuery {

	public Page<CodigoCFOP> resumir(CodigoCFOPFilter filter, Pageable pageable);

}
