package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
