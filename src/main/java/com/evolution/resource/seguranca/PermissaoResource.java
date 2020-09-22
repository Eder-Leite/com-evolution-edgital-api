package com.evolution.resource.seguranca;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.model.seguranca.Permissao;
import com.evolution.repository.seguranca.PermissaoRepository;

@RestController
@RequestMapping("/permissoes")
public class PermissaoResource {

	@Autowired
	private PermissaoRepository repository;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<Permissao> findOne(@PathVariable Long id) {
		Optional<Permissao> permissao = repository.findById(id);
		return permissao.isPresent() ? ResponseEntity.ok(permissao.get()) : ResponseEntity.notFound().build();
	}

	@GetMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<Permissao> findAll(HttpServletRequest request) {
		return repository.findAll();
	}

}
