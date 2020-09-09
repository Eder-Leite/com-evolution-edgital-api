package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.UnidadeProduto;
import com.evolution.repository.livro.unidadeProduto.UnidadeProdutoRepositoryQuery;

@Repository
public interface UnidadeProdutoRepository extends JpaRepository<UnidadeProduto, Long>, UnidadeProdutoRepositoryQuery {

}
