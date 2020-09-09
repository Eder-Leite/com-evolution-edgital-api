package com.evolution.repository.adm.operacaoEstoque;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.adm.filter.OperacaoEstoqueFilter;
import com.evolution.repository.adm.projection.OperacaoEstoqueResumo;

public interface OperacaoEstoqueRepositoryQuery {

	public Page<OperacaoEstoqueResumo> resumir(OperacaoEstoqueFilter filter, Pageable pageable);

}
