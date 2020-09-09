package com.evolution.repository.tesouraria.banco;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.tesouraria.filter.BancoFilter;
import com.evolution.repository.tesouraria.projection.BancoResumo;

public interface BancoRepositoryQuery {

	public Page<BancoResumo> resumir(BancoFilter filter, Pageable pageable);

}
