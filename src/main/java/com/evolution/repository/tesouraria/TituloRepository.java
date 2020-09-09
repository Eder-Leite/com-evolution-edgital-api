package com.evolution.repository.tesouraria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.tesouraria.Titulo;
import com.evolution.repository.tesouraria.titulo.TituloRepositoryQuery;

@Repository
public interface TituloRepository extends JpaRepository<Titulo, Long>, TituloRepositoryQuery {

}
