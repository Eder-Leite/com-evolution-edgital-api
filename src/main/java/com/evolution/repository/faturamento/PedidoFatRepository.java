package com.evolution.repository.faturamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.faturamento.PedidoFat;
import com.evolution.repository.faturamento.pedido.PedidoFatRepositoryQuery;

@Repository
public interface PedidoFatRepository extends JpaRepository<PedidoFat, Long>, PedidoFatRepositoryQuery {

}
