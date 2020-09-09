package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.CodigoCEST;
import com.evolution.repository.livro.codigoCEST.CodigoCESTRepositoryQuery;

@Repository
public interface CodigoCESTRepository extends JpaRepository<CodigoCEST, Long>, CodigoCESTRepositoryQuery {

}
