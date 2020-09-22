package com.evolution.resource.livro;

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

import com.evolution.model.livro.CodigoCFOP;
import com.evolution.repository.livro.CodigoCFOPRepository;
import com.evolution.repository.livro.filter.CodigoCFOPFilter;
import com.evolution.service.livro.CodigoCFOPService;

@RestController
@RequestMapping("/codigosCFOP")
public class CodigoCFOPResource {

	@Autowired
	private CodigoCFOPRepository repository;

	@Autowired
	private CodigoCFOPService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<CodigoCFOP> findOne(@PathVariable Long id) {
		Optional<CodigoCFOP> codigoCFOP = repository.findById(id);
		return codigoCFOP.isPresent() ? ResponseEntity.ok(codigoCFOP.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<CodigoCFOP> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<CodigoCFOP> resumir(CodigoCFOPFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<CodigoCFOP> create(@Valid @RequestBody CodigoCFOP codigoCFOP, HttpServletResponse response) {
		CodigoCFOP salvo = service.create(codigoCFOP);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<CodigoCFOP> update(@PathVariable Long id, @Valid @RequestBody CodigoCFOP codigoCFOP) {
		CodigoCFOP salvo = service.update(id, codigoCFOP);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
