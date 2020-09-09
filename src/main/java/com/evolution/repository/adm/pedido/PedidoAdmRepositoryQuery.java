package com.evolution.repository.adm.pedido;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.adm.filter.PedidoFilter;
import com.evolution.repository.adm.projection.PedidoResumo;

public interface PedidoAdmRepositoryQuery {

	public Page<PedidoResumo> resumir(PedidoFilter filter, Pageable pageable);

}
