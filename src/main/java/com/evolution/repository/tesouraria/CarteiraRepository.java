package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.Carteira;
import com.evolution.repository.tesouraria.carteira.CarteiraRepositoryQuery;

@Repository
public interface CarteiraRepository extends JpaRepository<Carteira, Long>, CarteiraRepositoryQuery {

}
