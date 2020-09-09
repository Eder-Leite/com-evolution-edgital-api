package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.MovimentoTes;
import com.evolution.repository.tesouraria.movimento.MovimentoTesRepositoryQuery;

@Repository
public interface MovimentoTesRepository extends JpaRepository<MovimentoTes, Long>, MovimentoTesRepositoryQuery {

}
