package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Vendedor;
import com.evolution.repository.cadastro.vendedor.VendedorRepositoryQuery;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long>, VendedorRepositoryQuery {

}
