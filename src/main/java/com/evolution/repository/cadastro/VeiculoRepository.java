package com.evolution.repository.cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.cadastro.Veiculo;
import com.evolution.repository.cadastro.veiculo.VeiculoRepositoryQuery;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long>, VeiculoRepositoryQuery {

}
