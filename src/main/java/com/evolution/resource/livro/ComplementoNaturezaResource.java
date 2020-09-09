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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.model.livro.ComplementoNatureza;
import com.evolution.repository.livro.ComplementoNaturezaRepository;
import com.evolution.repository.livro.filter.ComplementoNaturezaFilter;
import com.evolution.repository.livro.projection.ComplementoNaturezaResumo;
import com.evolution.service.livro.ComplementoNaturezaService;

@RestController
@RequestMapping("/complementosNatureza")
public class ComplementoNaturezaResource {

	@Autowired
	private ComplementoNaturezaRepository repository;

	@Autowired
	private ComplementoNaturezaService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<ComplementoNatureza> findOne(@PathVariable Long id) {
		ComplementoNatureza complementoNatureza = repository.findOne(id);
		return complementoNatureza != null ? ResponseEntity.ok(complementoNatureza) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<ComplementoNatureza> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "descricao"));
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<ComplementoNaturezaResumo> resumir(ComplementoNaturezaFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<ComplementoNatureza> create(@Valid @RequestBody ComplementoNatureza complementoNatureza,
			HttpServletResponse response) {
		ComplementoNatureza salvo = service.create(complementoNatureza);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<ComplementoNatureza> update(@PathVariable Long id,
			@Valid @RequestBody ComplementoNatureza complementoNatureza) {
		ComplementoNatureza salvo = service.update(id, complementoNatureza);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
