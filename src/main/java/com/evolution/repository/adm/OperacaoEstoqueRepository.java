package com.evolution.repository.adm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.adm.OperacaoEstoque;
import com.evolution.repository.adm.operacaoEstoque.OperacaoEstoqueRepositoryQuery;

@Repository
public interface OperacaoEstoqueRepository
		extends JpaRepository<OperacaoEstoque, Long>, OperacaoEstoqueRepositoryQuery {

}
