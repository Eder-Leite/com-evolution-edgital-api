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

import com.evolution.model.tesouraria.PlanoReceitaDespesa;
import com.evolution.repository.tesouraria.PlanoReceitaDespesaRepository;
import com.evolution.repository.tesouraria.filter.PlanoReceitaDespesaFilter;
import com.evolution.repository.tesouraria.projection.PlanoReceitaDespesaResumo;
import com.evolution.service.tesouraria.PlanoReceitaDespesaService;

@RestController
@RequestMapping("/planosReceitaDespesa")
public class PlanoReceitaDespesaResource {

	@Autowired
	private PlanoReceitaDespesaRepository repository;

	@Autowired
	private PlanoReceitaDespesaService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<PlanoReceitaDespesa> findOne(@PathVariable Long id) {
		Optional<PlanoReceitaDespesa> planoReceitaDespesa = repository.findById(id);
		return planoReceitaDespesa.isPresent() ? ResponseEntity.ok(planoReceitaDespesa.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<PlanoReceitaDespesa> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<PlanoReceitaDespesaResumo> resumir(PlanoReceitaDespesaFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<PlanoReceitaDespesa> create(@Valid @RequestBody PlanoReceitaDespesa planoReceitaDespesa,
			HttpServletResponse response) {
		PlanoReceitaDespesa salvo = service.create(planoReceitaDespesa);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<PlanoReceitaDespesa> update(@PathVariable Long id,
			@Valid @RequestBody PlanoReceitaDespesa planoReceitaDespesa) {
		PlanoReceitaDespesa salvo = service.update(id, planoReceitaDespesa);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
