package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.GrupoReceitaDespesa;
import com.evolution.repository.tesouraria.grupoReceitaDespesa.GrupoReceitaDespesaRepositoryQuery;

@Repository
public interface GrupoReceitaDespesaRepository
		extends JpaRepository<GrupoReceitaDespesa, Long>, GrupoReceitaDespesaRepositoryQuery {

}
