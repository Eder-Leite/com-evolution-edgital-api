package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.TalaoCheque;
import com.evolution.repository.tesouraria.talaoCheque.TalaoChequeRepositoryQuery;

@Repository
public interface TalaoChequeRepository extends JpaRepository<TalaoCheque, Long>, TalaoChequeRepositoryQuery {

}
