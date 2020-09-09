package com.evolution.repository.adm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.adm.PedidoAdm;
import com.evolution.repository.adm.pedido.PedidoAdmRepositoryQuery;

@Repository
public interface PedidoAdmRepository extends JpaRepository<PedidoAdm, Long>, PedidoAdmRepositoryQuery {

}
