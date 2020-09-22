package com.evolution.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import com.evolution.model.seguranca.Usuario;
import com.evolution.repository.seguranca.UsuarioRepository;

@Component
public class EvolutionSecurity {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario getAuthentication() {
		String email = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		return usuarioRepository.findByEmail(email);
	}
}
