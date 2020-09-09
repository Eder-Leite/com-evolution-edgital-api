package com.evolution.repository.faturamento.pedido;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.faturamento.filter.PedidoFilter;
import com.evolution.repository.faturamento.projection.PedidoResumo;

public interface PedidoFatRepositoryQuery {

	public Page<PedidoResumo> resumir(PedidoFilter filter, Pageable pageable);

}
