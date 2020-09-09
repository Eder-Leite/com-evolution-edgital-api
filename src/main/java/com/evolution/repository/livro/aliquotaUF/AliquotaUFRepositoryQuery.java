package com.evolution.repository.livro.aliquotaUF;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.AliquotaUFFilter;
import com.evolution.repository.livro.projection.AliquotaUFResumo;

public interface AliquotaUFRepositoryQuery {

	public Page<AliquotaUFResumo> resumir(AliquotaUFFilter filter, Pageable pageable);

}
