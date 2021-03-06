package com.evolution.repository.seguranca.usuario;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.evolution.repository.seguranca.filter.UsuarioFilter;
import com.evolution.repository.seguranca.projection.UsuarioResumo;

public interface UsuarioRepositoryQuery {

	public Page<UsuarioResumo> resumir(UsuarioFilter filter, Pageable pageable);

}
