package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.CodigoPisCofins;

@Repository
public interface CodigoPisCofinsRepository extends JpaRepository<CodigoPisCofins, Long> {

	public CodigoPisCofins findByCodigo(String codigo);

	public List<CodigoPisCofins> findByCodigoContaining(String codigo);

}
