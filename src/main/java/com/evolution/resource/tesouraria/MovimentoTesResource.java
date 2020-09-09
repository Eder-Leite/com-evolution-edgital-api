package com.evolution.resource.tesouraria;

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

import com.evolution.model.tesouraria.MovimentoTes;
import com.evolution.repository.tesouraria.MovimentoTesRepository;
import com.evolution.repository.tesouraria.filter.MovimentoFilter;
import com.evolution.repository.tesouraria.projection.MovimentoResumo;
import com.evolution.service.tesouraria.MovimentoTesService;

@RestController
@RequestMapping("/movimentosFinanceiro")
public class MovimentoTesResource {

	@Autowired
	private MovimentoTesRepository repository;

	@Autowired
	private MovimentoTesService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<MovimentoTes> findOne(@PathVariable Long id) {
		MovimentoTes movimento = repository.findOne(id);
		return movimento != null ? ResponseEntity.ok(movimento) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<MovimentoTes> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "data"));
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<MovimentoResumo> resumir(MovimentoFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<MovimentoTes> create(@Valid @RequestBody MovimentoTes movimento, HttpServletResponse response) {
		MovimentoTes salvo = service.create(movimento);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<MovimentoTes> update(@PathVariable Long id, @Valid @RequestBody MovimentoTes movimento) {
		MovimentoTes salvo = service.update(id, movimento);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
