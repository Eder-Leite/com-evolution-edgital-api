package com.evolution.resource.livro;

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

import com.evolution.model.livro.Origem;
import com.evolution.repository.livro.OrigemRepository;
import com.evolution.service.livro.OrigemService;

@RestController
@RequestMapping("/origensFiscal")
public class OrigemResource {

	@Autowired
	private OrigemRepository repository;

	@Autowired
	private OrigemService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<Origem> findOne(@PathVariable Long id) {
		Optional<Origem> origem = repository.findById(id);
		return origem.isPresent() ? ResponseEntity.ok(origem.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<Origem> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<Origem> findByCodigoContaining(String codigo) {
		return repository.findByCodigoContaining(codigo);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Origem> create(@Valid @RequestBody Origem origem, HttpServletResponse response) {
		Origem salvo = service.create(origem);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Origem> update(@PathVariable Long id, @Valid @RequestBody Origem origem) {
		Origem salvo = service.update(id, origem);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
