package com.evolution.repository.tesouraria;

import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.evolution.model.tesouraria.LancamentoManual;
import com.evolution.repository.tesouraria.lancamentoManual.LancamentoManualRepositoryQuery;

@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "TES_PMANIPULA_LANCAMENT_MANUAL", procedureName = "TES_PMANIPULA_LANCAMENT_MANUAL", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "P_ACAO", type = String.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "P_CODIGO", type = Long.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "P_EMPRESA", type = Long.class),
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "P_USUARIO", type = Long.class) }) })

@Repository
public interface LancamentoManualRepository
		extends JpaRepository<LancamentoManual, Long>, LancamentoManualRepositoryQuery {

	@Transactional
	@Procedure(name = "TES_PMANIPULA_LANCAMENT_MANUAL")
	public void TES_PMANIPULA_LANCAMENT_MANUAL(String P_ACAO, Long P_CODIGO, Long P_EMPRESA, Long P_USUARIO);

}
