package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Filial;
import com.evolution.repository.cadastro.filial.FilialRepositoryQuery;

@Repository
public interface FilialRepository extends JpaRepository<Filial, Long>, FilialRepositoryQuery {

}
