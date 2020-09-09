package com.evolution.repository.adm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolution.model.adm.Almoxarifado;
import com.evolution.repository.adm.almoxarifado.AlmoxarifadoRepositoryQuery;

@Repository
public interface AlmoxarifadoRepository extends JpaRepository<Almoxarifado, Long>, AlmoxarifadoRepositoryQuery {

}
