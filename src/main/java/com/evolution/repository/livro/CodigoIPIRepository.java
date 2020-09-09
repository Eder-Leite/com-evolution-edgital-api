package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.CodigoIPI;

@Repository
public interface CodigoIPIRepository extends JpaRepository<CodigoIPI, Long> {

	public CodigoIPI findByCodigo(String codigo);

	public List<CodigoIPI> findByCodigoContaining(String codigo);

}
