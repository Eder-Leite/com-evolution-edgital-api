package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.Origem;

@Repository
public interface OrigemRepository extends JpaRepository<Origem, Long> {

	public List<Origem> findByCodigoContaining(String codigo);

}
