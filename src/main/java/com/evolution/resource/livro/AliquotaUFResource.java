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

import com.evolution.model.livro.AliquotaUF;
import com.evolution.repository.livro.AliquotaUFRepository;
import com.evolution.repository.livro.filter.AliquotaUFFilter;
import com.evolution.repository.livro.projection.AliquotaUFResumo;
import com.evolution.service.livro.AliquotaUFService;

@RestController
@RequestMapping("/aliquotasUF")
public class AliquotaUFResource {

	@Autowired
	private AliquotaUFRepository repository;

	@Autowired
	private AliquotaUFService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<AliquotaUF> findOne(@PathVariable Long id) {
		AliquotaUF aliquotaUF = repository.findOne(id);
		return aliquotaUF != null ? ResponseEntity.ok(aliquotaUF) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<AliquotaUF> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "descricao"));
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<AliquotaUFResumo> resumir(AliquotaUFFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<AliquotaUF> create(@Valid @RequestBody AliquotaUF aliquotaUF, HttpServletResponse response) {
		AliquotaUF salvo = service.create(aliquotaUF);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<AliquotaUF> update(@PathVariable Long id, @Valid @RequestBody AliquotaUF aliquotaUF) {
		AliquotaUF salvo = service.update(id, aliquotaUF);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
