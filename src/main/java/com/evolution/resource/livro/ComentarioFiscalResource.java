package com.evolution.resource.livro;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.model.livro.ComentarioFiscal;
import com.evolution.repository.livro.ComentarioFiscalRepository;
import com.evolution.repository.livro.filter.ComentarioFiscalFilter;
import com.evolution.service.livro.ComentarioFiscalService;

@RestController
@RequestMapping("/comentariosFiscal")
public class ComentarioFiscalResource {

	@Autowired
	private ComentarioFiscalRepository repository;

	@Autowired
	private ComentarioFiscalService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<ComentarioFiscal> findOne(@PathVariable Long id) {
		ComentarioFiscal comentarioFiscal = repository.findOne(id);
		return comentarioFiscal != null ? ResponseEntity.ok(comentarioFiscal) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<ComentarioFiscal> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "descricao"));
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<ComentarioFiscal> resumir(ComentarioFiscalFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<ComentarioFiscal> create(@Valid @RequestBody ComentarioFiscal comentarioFiscal,
			HttpServletResponse response) {
		ComentarioFiscal salvo = service.create(comentarioFiscal);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<ComentarioFiscal> update(@PathVariable Long id,
			@Valid @RequestBody ComentarioFiscal comentarioFiscal) {
		ComentarioFiscal salvo = service.update(id, comentarioFiscal);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
