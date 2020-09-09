package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.AliquotaNCM;
import com.evolution.repository.livro.aliquotaNCM.AliquotaNCMRepositoryQuery;

@Repository
public interface AliquotaNCMRepository extends JpaRepository<AliquotaNCM, Long>, AliquotaNCMRepositoryQuery {

}
