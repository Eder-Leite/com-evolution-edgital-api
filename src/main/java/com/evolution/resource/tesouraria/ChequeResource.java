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

import com.evolution.model.tesouraria.Cheque;
import com.evolution.repository.tesouraria.ChequeRepository;
import com.evolution.repository.tesouraria.filter.ChequeFilter;
import com.evolution.repository.tesouraria.projection.ChequeResumo;
import com.evolution.service.tesouraria.ChequeService;

@RestController
@RequestMapping("/cheques")
public class ChequeResource {

	@Autowired
	private ChequeRepository repository;

	@Autowired
	private ChequeService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<Cheque> findOne(@PathVariable Long id) {
		Cheque cheque = repository.findOne(id);
		return cheque != null ? ResponseEntity.ok(cheque) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<Cheque> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "numero"));
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<ChequeResumo> resumir(ChequeFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Cheque> create(@Valid @RequestBody Cheque cheque, HttpServletResponse response) {
		Cheque salvo = service.create(cheque);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Cheque> update(@PathVariable Long id, @Valid @RequestBody Cheque cheque) {
		Cheque salvo = service.update(id, cheque);
		return ResponseEntity.ok(salvo);
	}

	@PutMapping("/{id}/recuperar")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void recuperaCheque(@PathVariable Long id) {
		service.recuperaCheque(id);
	}

	@PutMapping("/{id}/inutilizar")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void inutilizaCheque(@PathVariable Long id) {
		service.inutilizaCheque(id);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
