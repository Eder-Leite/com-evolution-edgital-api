package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
