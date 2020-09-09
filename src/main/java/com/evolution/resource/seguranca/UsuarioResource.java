package com.evolution.resource.seguranca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.evolution.model.seguranca.Usuario;
import com.evolution.repository.seguranca.UsuarioRepository;
import com.evolution.repository.seguranca.filter.PerfilUsuario;
import com.evolution.repository.seguranca.filter.RecuperaSenha;
import com.evolution.repository.seguranca.filter.UsuarioFilter;
import com.evolution.repository.seguranca.projection.UsuarioResumo;
import com.evolution.service.NegocioExceptionService;
import com.evolution.service.seguranca.UsuarioService;
import com.evolution.email.EmailService;
import com.evolution.email.Mail;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioRepository repository;

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private EmailService emailService;

	private String senha;

	@GetMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public ResponseEntity<Usuario> findOne(@PathVariable Long id) {
		Usuario usuario = repository.findOne(id);

		if (usuario != null) {
			usuario.setSenha(null);
			return ResponseEntity.ok(usuario);
		}

		return ResponseEntity.notFound().build();
	}

	@GetMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public List<Usuario> findAll(HttpServletRequest request) {
		return repository.findAll(new Sort(Sort.Direction.ASC, "nome"));
	}

	@PostMapping
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Usuario> create(@Valid @RequestBody Usuario usuario, HttpServletResponse response) {
		usuario.setSenha(encodaSenha(usuario.getSenha()));
		Usuario usuarioSalva = usuarioService.create(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalva);
	}

	@PutMapping("/{id}")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<Usuario> update(@PathVariable Long id, @Valid @RequestBody Usuario usuario) {
		if (!StringUtils.isEmpty(usuario.getSenha())) {
			usuario.setSenha(encodaSenha(usuario.getSenha()));
		}
		Usuario usuarioSalva = usuarioService.update(id, usuario);

		if (usuarioSalva != null) {
			return ResponseEntity.ok(usuarioSalva);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(usuario);
		}
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}

	@PostMapping("/alterarSenha")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('write')")
	public ResponseEntity<PerfilUsuario> alterPassword(@Valid @RequestBody PerfilUsuario p,
			HttpServletResponse response) {

		if (!autenticacaoSenha(p)) {
			throw new NegocioExceptionService("Atenção a senha digitada não confere com a senha antiga!");
		}

		Usuario usuarioSalva = repository.findOne(p.getId());
		usuarioSalva.setSenha(p.getSenhaNova());
		usuarioSalva.setSenha(encodaSenha(usuarioSalva.getSenha()));
		usuarioService.update(usuarioSalva.getId(), usuarioSalva);

		return ResponseEntity.status(HttpStatus.CREATED).body(p);
	}

	@GetMapping(params = "resumo")
	@PreAuthorize("hasAnyAuthority('ROLE_DESENVOLVEDOR') and #oauth2.hasScope('read')")
	public Page<UsuarioResumo> resumir(UsuarioFilter filter, Pageable pageable) {
		return repository.resumir(filter, pageable);
	}

	@PostMapping("/recuperaSenha")
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public ResponseEntity<RecuperaSenha> enviarSenha(@Valid @RequestBody RecuperaSenha recuperaSenha) {

		System.out.println(recuperaSenha.toString());
		try {
			Usuario usuario = repository.findByEmail(recuperaSenha.getEmail().toUpperCase());

			if (usuario != null) {
				if (usuario.getNome().toUpperCase().equals(recuperaSenha.getNome().toUpperCase())) {
					String senha = geraSenha();
					Usuario usuarioSalva = usuario;
					usuarioSalva.setSenha(senha);
					usuarioSalva.setSenha(encodaSenha(usuarioSalva.getSenha()));
					usuarioService.update(usuarioSalva.getId(), usuarioSalva);

					Mail mail = new Mail();
					mail.setFrom("Evolution Sistemas <nao-responda@evolutionsistemas.com.br>");
					mail.setTo(usuarioSalva.getNome() + " <" + usuarioSalva.getEmail() + ">");
					mail.setSubject("Recuperação de Senha");

					Map model = new HashMap();
					model.put("nome", usuarioSalva.getNome());
					model.put("email", usuarioSalva.getEmail());
					model.put("senha", senha);
					mail.setModel(model);

					emailService.sendSimpleMessage(mail, "email-template");

					recuperaSenha.setMensagem("e-mail enviado com sucesso!");

					return ResponseEntity.ok(recuperaSenha);

				} else {
					return ResponseEntity.notFound().build();
				}
			} else {
				return ResponseEntity.notFound().build();
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());
			return ResponseEntity.notFound().build();
		}
	}

	public boolean autenticacaoSenha(PerfilUsuario p) {
		Usuario usuario = repository.findOne(p.getId());
		BCryptPasswordEncoder password = new BCryptPasswordEncoder();

		if (password.matches(p.getSenhaAntiga(), usuario.getSenha())) {
			return true;
		} else {
			return false;
		}
	}

	public String geraSenha() {

		String[] carct = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
				"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
				"Y", "Z" };

		senha = "";

		for (int x = 0; x < 10; x++) {
			int j = (int) (Math.random() * carct.length);
			senha += carct[j];
		}
		return this.senha;
	}

	public String encodaSenha(String senha) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(senha);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}