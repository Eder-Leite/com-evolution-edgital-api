package com.evolution.repository.livro.unidadeProduto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.UnidadeProdutoFilter;
import com.evolution.repository.livro.projection.UnidadeProdutoResumo;

public interface UnidadeProdutoRepositoryQuery {

	public Page<UnidadeProdutoResumo> resumir(UnidadeProdutoFilter filter, Pageable pageable);

}
