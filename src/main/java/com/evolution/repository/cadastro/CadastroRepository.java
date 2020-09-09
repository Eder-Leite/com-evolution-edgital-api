package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Cadastro;
import com.evolution.repository.cadastro.cadastro.CadastroRepositoryQuery;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>, CadastroRepositoryQuery {

}
