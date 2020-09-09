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

import com.evolution.model.tesouraria.TalaoCheque;
import com.evolution.repository.tesouraria.TalaoChequeRepository;
import com.evolution.repository.tesouraria.filter.TalaoChequeFilter;
import com.evolution.repository.tesouraria.projection.TalaoChequeResumo;
import com.evolution.service.tesouraria.TalaoChequeService;

@RestController
@RequestMapping("/taloesCheque")
public class TalaoChequeResource {

	@Autowired
	private TalaoChequeRepository repository;

	@Autowired
	private TalaoChequeService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<TalaoCheque> findOne(@PathVariable Long id) {
		TalaoCheque talaoCheque = repository.findOne(id);
		return talaoCheque != null ? ResponseEntity.ok(talaoCheque) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<TalaoCheque> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "numero"));
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<TalaoChequeResumo> resumir(TalaoChequeFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<TalaoCheque> create(@Valid @RequestBody TalaoCheque talaoCheque,
			HttpServletResponse response) {
		TalaoCheque salvo = service.create(talaoCheque);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<TalaoCheque> update(@PathVariable Long id, @Valid @RequestBody TalaoCheque talaoCheque) {
		TalaoCheque salvo = service.update(id, talaoCheque);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
