package com.evolution.resource.tesouraria;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.model.tesouraria.LancamentoManual;
import com.evolution.repository.tesouraria.LancamentoManualRepository;
import com.evolution.repository.tesouraria.filter.LancamentoManualFilter;
import com.evolution.repository.tesouraria.projection.LancamentoManualResumo;
import com.evolution.security.EvolutionSecurity;
import com.evolution.service.tesouraria.LancamentoManualService;

@RestController
@RequestMapping("/lancamentosManualFinanceiro")
public class LancamentoManualResource {

	@Autowired
	private EvolutionSecurity security;

	@Autowired
	private LancamentoManualRepository repository;

	@Autowired
	private LancamentoManualService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<LancamentoManual> findOne(@PathVariable Long id) {
		Optional<LancamentoManual> lancamentoManual = repository.findById(id);
		return lancamentoManual.isPresent() ? ResponseEntity.ok(lancamentoManual.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<LancamentoManual> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<LancamentoManualResumo> resumir(LancamentoManualFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<LancamentoManual> create(@Valid @RequestBody LancamentoManual lancamentoManual,
			HttpServletResponse response) {
		LancamentoManual salvo = service.create(lancamentoManual);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}/abrir")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void abrir(@PathVariable Long id) {

		Optional<LancamentoManual> lancamentoManual = repository.findById(id);

		if (!lancamentoManual.isPresent()) {
			throw new EmptyResultDataAccessException(1);
		}

		repository.TES_PMANIPULA_LANCAMENT_MANUAL("ABRIR", id,
				security.getAuthentication().getFilial().getEmpresa().getId(), security.getAuthentication().getId());
	}

	@PutMapping("/{id}/fechar")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void fechar(@PathVariable Long id) {
		repository.TES_PMANIPULA_LANCAMENT_MANUAL("FECHAR", id,
				security.getAuthentication().getFilial().getEmpresa().getId(), security.getAuthentication().getId());
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<LancamentoManual> update(@PathVariable Long id,
			@Valid @RequestBody LancamentoManual lancamentoManual) {
		LancamentoManual salvo = service.update(id, lancamentoManual);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
