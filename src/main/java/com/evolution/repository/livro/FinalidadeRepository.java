package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.Finalidade;
import com.evolution.repository.livro.finalidade.FinalidadeRepositoryQuery;

@Repository
public interface FinalidadeRepository extends JpaRepository<Finalidade, Long>, FinalidadeRepositoryQuery {

}
