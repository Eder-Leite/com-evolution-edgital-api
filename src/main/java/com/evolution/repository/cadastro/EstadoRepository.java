package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Estado;
import com.evolution.repository.cadastro.estado.EstadoRepositoryQuery;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>, EstadoRepositoryQuery {

}
