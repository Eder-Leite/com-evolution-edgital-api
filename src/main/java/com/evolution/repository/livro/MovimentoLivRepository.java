package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.MovimentoLiv;
import com.evolution.repository.livro.movimento.MovimentoLivRepositoryQuery;

@Repository
public interface MovimentoLivRepository extends JpaRepository<MovimentoLiv, Long>, MovimentoLivRepositoryQuery {

}
