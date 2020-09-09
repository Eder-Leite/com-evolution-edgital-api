package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Long> {

}
