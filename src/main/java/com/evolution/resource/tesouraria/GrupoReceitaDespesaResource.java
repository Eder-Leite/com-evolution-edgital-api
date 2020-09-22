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

import com.evolution.model.tesouraria.GrupoReceitaDespesa;
import com.evolution.repository.tesouraria.GrupoReceitaDespesaRepository;
import com.evolution.repository.tesouraria.filter.GrupoReceitaDespesaFilter;
import com.evolution.repository.tesouraria.projection.GrupoReceitaDespesaResumo;
import com.evolution.service.tesouraria.GrupoReceitaDespesaService;

@RestController
@RequestMapping("/gruposReceitaDespesa")
public class GrupoReceitaDespesaResource {

	@Autowired
	private GrupoReceitaDespesaRepository repository;

	@Autowired
	private GrupoReceitaDespesaService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<GrupoReceitaDespesa> findOne(@PathVariable Long id) {
		Optional<GrupoReceitaDespesa> grupoReceitaDespesa = repository.findById(id);
		return grupoReceitaDespesa.isPresent() ? ResponseEntity.ok(grupoReceitaDespesa.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<GrupoReceitaDespesa> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<GrupoReceitaDespesaResumo> resumir(GrupoReceitaDespesaFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<GrupoReceitaDespesa> create(@Valid @RequestBody GrupoReceitaDespesa grupoReceitaDespesa,
			HttpServletResponse response) {
		GrupoReceitaDespesa salvo = service.create(grupoReceitaDespesa);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<GrupoReceitaDespesa> update(@PathVariable Long id,
			@Valid @RequestBody GrupoReceitaDespesa grupoReceitaDespesa) {
		GrupoReceitaDespesa salvo = service.update(id, grupoReceitaDespesa);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
