package com.evolution.resource.tesouraria;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.evolution.model.tesouraria.HistoricoBancario;
import com.evolution.repository.tesouraria.HistoricoBancarioRepository;
import com.evolution.service.tesouraria.HistoricoBancarioService;

@RestController
@RequestMapping("/historicosBancario")
public class HistoricoBancarioResource {

	@Autowired
	private HistoricoBancarioRepository repository;

	@Autowired
	private HistoricoBancarioService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<HistoricoBancario> findOne(@PathVariable Long id) {
		Optional<HistoricoBancario> historicoBancario = repository.findById(id);
		return historicoBancario.isPresent() ? ResponseEntity.ok(historicoBancario.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<HistoricoBancario> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<HistoricoBancario> create(@Valid @RequestBody HistoricoBancario historicoBancario,
			HttpServletResponse response) {
		HistoricoBancario salvo = service.create(historicoBancario);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<HistoricoBancario> update(@PathVariable Long id,
			@Valid @RequestBody HistoricoBancario historicoBancario) {
		HistoricoBancario salvo = service.update(id, historicoBancario);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
