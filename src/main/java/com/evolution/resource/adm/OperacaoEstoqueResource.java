package com.evolution.resource.adm;

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

import com.evolution.model.adm.OperacaoEstoque;
import com.evolution.repository.adm.OperacaoEstoqueRepository;
import com.evolution.repository.adm.filter.OperacaoEstoqueFilter;
import com.evolution.repository.adm.projection.OperacaoEstoqueResumo;
import com.evolution.service.adm.OperacaoEstoqueService;

@RestController
@RequestMapping("/operacoesEstoque")
public class OperacaoEstoqueResource {

	@Autowired
	private OperacaoEstoqueRepository repository;

	@Autowired
	private OperacaoEstoqueService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<OperacaoEstoque> findOne(@PathVariable Long id) {
		Optional<OperacaoEstoque> operacaoEstoque = repository.findById(id);
		return operacaoEstoque.isPresent() ? ResponseEntity.ok(operacaoEstoque.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<OperacaoEstoque> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<OperacaoEstoqueResumo> resumir(OperacaoEstoqueFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<OperacaoEstoque> create(@Valid @RequestBody OperacaoEstoque operacaoEstoque,
			HttpServletResponse response) {
		OperacaoEstoque salvo = service.create(operacaoEstoque);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<OperacaoEstoque> update(@PathVariable Long id,
			@Valid @RequestBody OperacaoEstoque operacaoEstoque) {
		OperacaoEstoque salvo = service.update(id, operacaoEstoque);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
