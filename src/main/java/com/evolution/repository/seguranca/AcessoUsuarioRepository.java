package com.evolution.repository.seguranca;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.seguranca.AcessoUsuario;

@Repository
public interface AcessoUsuarioRepository extends JpaRepository<AcessoUsuario, Long> {

}
