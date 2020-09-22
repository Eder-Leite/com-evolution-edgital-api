package com.evolution.resource.tesouraria;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.evolution.model.tesouraria.LocalFaturamento;
import com.evolution.repository.tesouraria.LocalFaturamentoRepository;
import com.evolution.repository.tesouraria.filter.LocalFaturamentoFilter;
import com.evolution.repository.tesouraria.projection.LocalFaturamentoResumo;
import com.evolution.service.tesouraria.LocalFaturamentoService;

@RestController
@RequestMapping("/locaisFaturamento")
public class LocalFaturamentoResource {

	@Autowired
	private LocalFaturamentoRepository repository;

	@Autowired
	private LocalFaturamentoService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<LocalFaturamento> findOne(@PathVariable Long id) {
		Optional<LocalFaturamento> localFaturamento = repository.findById(id);
		return localFaturamento.isPresent() ? ResponseEntity.ok(localFaturamento.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<LocalFaturamento> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<LocalFaturamentoResumo> resumir(LocalFaturamentoFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<LocalFaturamento> create(@Valid @RequestBody LocalFaturamento localFaturamento,
			HttpServletResponse response) {
		LocalFaturamento salvo = service.create(localFaturamento);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<LocalFaturamento> update(@PathVariable Long id,
			@Valid @RequestBody LocalFaturamento localFaturamento) {
		LocalFaturamento salvo = service.update(id, localFaturamento);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
