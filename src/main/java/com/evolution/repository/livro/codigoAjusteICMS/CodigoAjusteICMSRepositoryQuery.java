package com.evolution.repository.livro.codigoAjusteICMS;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.model.livro.CodigoAjusteICMS;
import com.evolution.repository.livro.filter.CodigoAjusteICMSFilter;

public interface CodigoAjusteICMSRepositoryQuery {

	public Page<CodigoAjusteICMS> resumir(CodigoAjusteICMSFilter filter, Pageable pageable);

}
