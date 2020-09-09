package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.CodigoCFOP;
import com.evolution.repository.livro.codigoCFOP.CodigoCFOPRepositoryQuery;

@Repository
public interface CodigoCFOPRepository extends JpaRepository<CodigoCFOP, Long>, CodigoCFOPRepositoryQuery {

}
