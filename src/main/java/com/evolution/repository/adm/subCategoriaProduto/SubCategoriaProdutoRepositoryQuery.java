package com.evolution.repository.adm.subCategoriaProduto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.adm.filter.SubCategoriaProdutoFilter;
import com.evolution.repository.adm.projection.SubCategoriaProdutoResumo;

public interface SubCategoriaProdutoRepositoryQuery {

	public Page<SubCategoriaProdutoResumo> resumir(SubCategoriaProdutoFilter filter, Pageable pageable);

}
