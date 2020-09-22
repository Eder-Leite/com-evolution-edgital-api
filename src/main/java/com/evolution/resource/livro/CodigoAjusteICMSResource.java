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

import com.evolution.model.livro.CodigoAjusteICMS;
import com.evolution.repository.livro.CodigoAjusteICMSRepository;
import com.evolution.repository.livro.filter.CodigoAjusteICMSFilter;
import com.evolution.service.livro.CodigoAjusteICMSService;

@RestController
@RequestMapping("/codigosAjusteICMS")
public class CodigoAjusteICMSResource {

	@Autowired
	private CodigoAjusteICMSRepository repository;

	@Autowired
	private CodigoAjusteICMSService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<CodigoAjusteICMS> findOne(@PathVariable Long id) {
		Optional<CodigoAjusteICMS> codigoAjusteICMS = repository.findById(id);
		return codigoAjusteICMS.isPresent() ? ResponseEntity.ok(codigoAjusteICMS.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<CodigoAjusteICMS> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<CodigoAjusteICMS> resumir(CodigoAjusteICMSFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<CodigoAjusteICMS> create(@Valid @RequestBody CodigoAjusteICMS codigoAjusteICMS,
			HttpServletResponse response) {
		CodigoAjusteICMS salvo = service.create(codigoAjusteICMS);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<CodigoAjusteICMS> update(@PathVariable Long id,
			@Valid @RequestBody CodigoAjusteICMS codigoAjusteICMS) {
		CodigoAjusteICMS salvo = service.update(id, codigoAjusteICMS);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
