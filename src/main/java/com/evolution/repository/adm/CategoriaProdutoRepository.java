package com.evolution.repository.adm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.adm.CategoriaProduto;
import com.evolution.repository.adm.categoriaProduto.CategoriaProdutoRepositoryQuery;

@Repository
public interface CategoriaProdutoRepository
		extends JpaRepository<CategoriaProduto, Long>, CategoriaProdutoRepositoryQuery {

}
