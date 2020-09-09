package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.ComentarioFiscal;
import com.evolution.repository.livro.comentarioFiscal.ComentarioFiscalRepositoryQuery;

@Repository
public interface ComentarioFiscalRepository
		extends JpaRepository<ComentarioFiscal, Long>, ComentarioFiscalRepositoryQuery {

}
