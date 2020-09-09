package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.ComplementoNatureza;
import com.evolution.repository.livro.complementoNatureza.ComplementoNaturezaRepositoryQuery;

@Repository
public interface ComplementoNaturezaRepository
		extends JpaRepository<ComplementoNatureza, Long>, ComplementoNaturezaRepositoryQuery {

}
