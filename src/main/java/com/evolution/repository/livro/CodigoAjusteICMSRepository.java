package com.evolution.repository.livro;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.CodigoAjusteICMS;
import com.evolution.repository.livro.codigoAjusteICMS.CodigoAjusteICMSRepositoryQuery;

@Repository
public interface CodigoAjusteICMSRepository
		extends JpaRepository<CodigoAjusteICMS, Long>, CodigoAjusteICMSRepositoryQuery {

	public List<CodigoAjusteICMS> findByCodigoContaining(String codigo);

}
