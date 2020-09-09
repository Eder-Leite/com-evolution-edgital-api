package com.evolution.repository.livro.aliquotaNCM;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.livro.filter.AliquotaNCMFilter;
import com.evolution.repository.livro.projection.AliquotaNCMResumo;

public interface AliquotaNCMRepositoryQuery {

	public Page<AliquotaNCMResumo> resumir(AliquotaNCMFilter filter, Pageable pageable);

}
