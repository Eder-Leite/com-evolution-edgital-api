package com.evolution.repository.adm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.adm.SubCategoriaProduto;
import com.evolution.repository.adm.subCategoriaProduto.SubCategoriaProdutoRepositoryQuery;

@Repository
public interface SubCategoriaProdutoRepository
		extends JpaRepository<SubCategoriaProduto, Long>, SubCategoriaProdutoRepositoryQuery {

}
