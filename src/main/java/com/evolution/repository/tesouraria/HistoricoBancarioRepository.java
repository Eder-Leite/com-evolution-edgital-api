package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.HistoricoBancario;;

@Repository
public interface HistoricoBancarioRepository extends JpaRepository<HistoricoBancario, Long> {

}
