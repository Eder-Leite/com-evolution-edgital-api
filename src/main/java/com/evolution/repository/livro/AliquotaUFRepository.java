package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.AliquotaUF;
import com.evolution.repository.livro.aliquotaUF.AliquotaUFRepositoryQuery;

@Repository
public interface AliquotaUFRepository extends JpaRepository<AliquotaUF, Long>, AliquotaUFRepositoryQuery {

}
