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

import com.evolution.model.adm.CategoriaProduto;
import com.evolution.repository.adm.CategoriaProdutoRepository;
import com.evolution.repository.adm.filter.CategoriaProdutoFilter;
import com.evolution.repository.adm.projection.CategoriaProdutoResumo;
import com.evolution.service.adm.CategoriaProdutoService;

@RestController
@RequestMapping("/categoriasProduto")
public class CategoriaProdutoResource {

	@Autowired
	private CategoriaProdutoRepository repository;

	@Autowired
	private CategoriaProdutoService service;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<CategoriaProduto> findOne(@PathVariable Long id) {
		Optional<CategoriaProduto> categoriaProduto = repository.findById(id);
		return categoriaProduto.isPresent() ? ResponseEntity.ok(categoriaProduto.get())
				: ResponseEntity.notFound().build();
	}

	@GetMapping
	@ResponseBody
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<CategoriaProduto> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<CategoriaProdutoResumo> resumir(CategoriaProdutoFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<CategoriaProduto> create(@Valid @RequestBody CategoriaProduto categoriaProduto,
			HttpServletResponse response) {
		CategoriaProduto salvo = service.create(categoriaProduto);
		return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<CategoriaProduto> update(@PathVariable Long id,
			@Valid @RequestBody CategoriaProduto categoriaProduto) {
		CategoriaProduto salvo = service.update(id, categoriaProduto);
		return ResponseEntity.ok(salvo);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id, HttpServletResponse response) {
		service.delete(id);
	}

}
