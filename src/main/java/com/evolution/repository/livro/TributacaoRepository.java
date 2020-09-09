package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.Tributacao;

@Repository
public interface TributacaoRepository extends JpaRepository<Tributacao, Long> {

	public Tributacao findByCodigo(String codigo);

	public List<Tributacao> findByCodigoContaining(String codigo);

}
