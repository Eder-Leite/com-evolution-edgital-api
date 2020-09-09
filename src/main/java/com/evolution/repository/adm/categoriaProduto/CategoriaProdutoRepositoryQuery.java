package com.evolution.repository.adm.categoriaProduto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.adm.filter.CategoriaProdutoFilter;
import com.evolution.repository.adm.projection.CategoriaProdutoResumo;

public interface CategoriaProdutoRepositoryQuery {

	public Page<CategoriaProdutoResumo> resumir(CategoriaProdutoFilter filter, Pageable pageable);

}
