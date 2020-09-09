package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.Banco;
import com.evolution.repository.tesouraria.banco.BancoRepositoryQuery;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long>, BancoRepositoryQuery {

}
