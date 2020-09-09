package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

	public Modelo findByCodigo(String codigo);

	public List<Modelo> findByCodigoContaining(String codigo);

}
