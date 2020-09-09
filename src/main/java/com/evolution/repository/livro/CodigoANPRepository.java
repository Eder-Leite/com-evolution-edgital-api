package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.CodigoANP;
import com.evolution.repository.livro.codigoANP.CodigoANPRepositoryQuery;

@Repository
public interface CodigoANPRepository extends JpaRepository<CodigoANP, Long>, CodigoANPRepositoryQuery {

	public CodigoANP findByCodigo(String codigo);

	public List<CodigoANP> findByCodigoContaining(String codigo);

}
