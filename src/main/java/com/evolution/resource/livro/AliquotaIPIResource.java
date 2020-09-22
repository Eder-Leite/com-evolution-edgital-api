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

import com.evolution.model.livro.AliquotaIPI;
import com.evolution.repository.livro.AliquotaIPIRepository;
import com.evolution.service.livro.AliquotaIPIService;

@RestController
@RequestMapping("/aliquotasIPI")
public class AliquotaIPIResource {

	@Autowired
	private AliquotaIPIRepository repository;

	@Autowired
	private AliquotaIPIService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<AliquotaIPI> findOne(@PathVariable Long id) {
		Optional<AliquotaIPI> salvo = repository.findById(id);
		return salvo.isPresent() ? ResponseEntity.ok(salvo.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<AliquotaIPI> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<AliquotaIPI> create(@Valid @RequestBody AliquotaIPI aliquotaIPI,
			HttpServletResponse response) {
		AliquotaIPI salvo = service.create(aliquotaIPI);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<AliquotaIPI> update(@PathVariable Long id, @Valid @RequestBody AliquotaIPI aliquotaIPI) {
		AliquotaIPI salvo = service.update(id, aliquotaIPI);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
