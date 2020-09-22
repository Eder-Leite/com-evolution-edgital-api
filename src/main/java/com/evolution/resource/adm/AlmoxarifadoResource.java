package com.evolution.resource.adm;

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

import com.evolution.model.adm.Almoxarifado;
import com.evolution.repository.adm.AlmoxarifadoRepository;
import com.evolution.repository.adm.filter.AlmoxarifadoFilter;
import com.evolution.repository.adm.projection.AlmoxarifadoResumo;
import com.evolution.service.adm.AlmoxarifadoService;

@RestController
@RequestMapping("/almoxarifados")
public class AlmoxarifadoResource {

	@Autowired
	private AlmoxarifadoRepository repository;

	@Autowired
	private AlmoxarifadoService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<Almoxarifado> findOne(@PathVariable Long id) {
		Optional<Almoxarifado> almoxarifado = repository.findById(id);
		return almoxarifado.isPresent() ? ResponseEntity.ok(almoxarifado.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<Almoxarifado> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<AlmoxarifadoResumo> resumir(AlmoxarifadoFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Almoxarifado> create(@Valid @RequestBody Almoxarifado almoxarifado,
			HttpServletResponse response) {
		Almoxarifado salvo = service.create(almoxarifado);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Almoxarifado> update(@PathVariable Long id, @Valid @RequestBody Almoxarifado almoxarifado) {
		Almoxarifado salvo = service.update(id, almoxarifado);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
