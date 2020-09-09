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

import com.evolution.model.livro.AliquotaNCM;
import com.evolution.repository.livro.AliquotaNCMRepository;
import com.evolution.repository.livro.filter.AliquotaNCMFilter;
import com.evolution.repository.livro.projection.AliquotaNCMResumo;
import com.evolution.service.livro.AliquotaNCMService;

@RestController
@RequestMapping("/aliquotasNCM")
public class AliquotaNCMResource {

	@Autowired
	private AliquotaNCMRepository repository;

	@Autowired
	private AliquotaNCMService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<AliquotaNCM> findOne(@PathVariable Long id) {
		AliquotaNCM aliquotaNCM = repository.findOne(id);
		return aliquotaNCM != null ? ResponseEntity.ok(aliquotaNCM) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<AliquotaNCM> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "descricao"));
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<AliquotaNCMResumo> resumir(AliquotaNCMFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<AliquotaNCM> create(@Valid @RequestBody AliquotaNCM aliquotaNCM,
			HttpServletResponse response) {
		AliquotaNCM salvo = service.create(aliquotaNCM);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<AliquotaNCM> update(@PathVariable Long id, @Valid @RequestBody AliquotaNCM aliquotaNCM) {
		AliquotaNCM salvo = service.update(id, aliquotaNCM);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
