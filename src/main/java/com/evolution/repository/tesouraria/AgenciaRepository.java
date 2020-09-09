package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.Agencia;
import com.evolution.repository.tesouraria.agencia.AgenciaRepositoryQuery;

@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Long>, AgenciaRepositoryQuery {

}
