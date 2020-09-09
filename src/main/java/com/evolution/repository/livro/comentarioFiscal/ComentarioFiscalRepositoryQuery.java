package com.evolution.repository.livro.comentarioFiscal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.model.livro.ComentarioFiscal;
import com.evolution.repository.livro.filter.ComentarioFiscalFilter;

public interface ComentarioFiscalRepositoryQuery {

	public Page<ComentarioFiscal> resumir(ComentarioFiscalFilter filter, Pageable pageable);

}
