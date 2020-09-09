package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.Conta;
import com.evolution.repository.tesouraria.conta.ContaRepositoryQuery;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>, ContaRepositoryQuery {

}
