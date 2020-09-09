package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {

	public Serie findByCodigo(String codigo);

	public List<Serie> findByCodigoContaining(String codigo);

}
