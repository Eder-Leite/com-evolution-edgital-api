package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.TipoBaixa;;

@Repository
public interface TipoBaixaRepository extends JpaRepository<TipoBaixa, Long> {

}
