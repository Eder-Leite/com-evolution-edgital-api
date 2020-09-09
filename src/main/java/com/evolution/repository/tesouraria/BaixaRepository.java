package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.Baixa;
import com.evolution.repository.tesouraria.baixa.BaixaRepositoryQuery;

@Repository
public interface BaixaRepository extends JpaRepository<Baixa, Long>, BaixaRepositoryQuery {

}
