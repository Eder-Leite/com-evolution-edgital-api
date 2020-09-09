package com.evolution.repository.livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.livro.AliquotaIPI;

@Repository
public interface AliquotaIPIRepository extends JpaRepository<AliquotaIPI, Long> {

}
