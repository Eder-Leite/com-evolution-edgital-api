package com.evolution.service.seguranca;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.evolution.model.seguranca.Permissao;
import com.evolution.model.seguranca.Usuario;
import com.evolution.model.seguranca.enumerador.TipoUsuario;
import com.evolution.repository.seguranca.UsuarioRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@Service
public class UsuarioService {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private UsuarioRepository repository;

	@Transactional
	public Usuario create(Usuario usuario) {
		usuario = setRoles(usuario);
		Usuario salvo = repository.save(usuario);
		return salvo;
	}

	@Transactional
	public Usuario update(Long id, Usuario usuario) {
		Usuario salvo = findById(id);

		if (StringUtils.isEmpty(usuario.getSenha())) {
			usuario.setSenha(salvo.getSenha());
		}

		usuario = setRoles(usuario);

		return repository.save(usuario);
	}

	@Transactional
	public void delete(Long id) {
		Usuario salvo = findById(id);
		repository.delete(salvo);
	}

	private Usuario setRoles(Usuario usuario) {

		if (usuario.getTipo() == TipoUsuario.DESENVOLVEDOR) {
			usuario.getPermissoes().clear();

			Permissao desenvolvedor = new Permissao();
			desenvolvedor.setId(1l);
			usuario.getPermissoes().add(desenvolvedor);

			Permissao administrador = new Permissao();
			administrador.setId(2l);
			usuario.getPermissoes().add(administrador);

			Permissao supervisor = new Permissao();
			supervisor.setId(3l);
			usuario.getPermissoes().add(supervisor);

			Permissao funcionario = new Permissao();
			funcionario.setId(4l);
			usuario.getPermissoes().add(funcionario);

			return usuario;
		}

		if (usuario.getTipo() == TipoUsuario.ADMINISTRADOR) {
			usuario.getPermissoes().clear();

			Permissao administrador = new Permissao();
			administrador.setId(2l);
			usuario.getPermissoes().add(administrador);

			Permissao supervisor = new Permissao();
			supervisor.setId(3l);
			usuario.getPermissoes().add(supervisor);

			Permissao funcionario = new Permissao();
			funcionario.setId(4l);
			usuario.getPermissoes().add(funcionario);

			return usuario;
		}

		if (usuario.getTipo() == TipoUsuario.SUPERVISOR) {
			usuario.getPermissoes().clear();

			Permissao supervisor = new Permissao();
			supervisor.setId(3l);
			usuario.getPermissoes().add(supervisor);

			Permissao funcionario = new Permissao();
			funcionario.setId(4l);
			usuario.getPermissoes().add(funcionario);

			return usuario;
		}

		if (usuario.getTipo() == TipoUsuario.FUNCIONÁRIO) {
			usuario.getPermissoes().clear();

			Permissao funcionario = new Permissao();
			funcionario.setId(4l);
			usuario.getPermissoes().add(funcionario);

			return usuario;
		}

		return null;
	}

	public Usuario findById(Long id) {
		Usuario salvo = repository.findById(id).orElseThrow(() -> new EmptyResultDataAccessException(1));
		return salvo;
	}

	public void relatorioUsuarios(Map<String, Object> parametros, HttpServletResponse response)
			throws JRException, SQLException, IOException {

		System.out.println("\n********** Download: ************\n");

		parametros = parametros == null ? parametros = new HashMap<>() : parametros;

		// Pega o arquivo .jasper localizado em resources
		InputStream jasperStream = this.getClass().getResourceAsStream("/relatorios/usuarios.jasper");

		// Cria o objeto JaperReport com o Stream do arquivo jasper
		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);
		// Passa para o JasperPrint o relatório, os parâmetros e a fonte dos
		// dados, no caso uma conexão ao banco de dados
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, dataSource.getConnection());

		// Configura a respota para o tipo PDF
		response.setContentType("application/pdf");
		// Define que o arquivo pode ser visualizado no navegador e também nome
		// final do arquivo
		// para fazer download do relatório troque 'inline' por 'attachment'
		response.setHeader("Content-Disposition", "inline; filename=usuarios.pdf");

		// Faz a exportação do relatório para o HttpServletResponse
		final OutputStream outStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
	}

	public ResponseEntity<byte[]> downloadFile(Map<String, Object> parametros, HttpServletResponse response)
			throws JRException, SQLException {

		System.out.println("\n********** Download: ************\n");

		parametros = parametros == null ? parametros = new HashMap<>() : parametros;

		InputStream jasperStream = this.getClass().getResourceAsStream("/relatorios/usuarios.jasper");

		JasperReport jasperReport = (JasperReport) JRLoader.loadObject(jasperStream);

		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, dataSource.getConnection());

		byte[] file = JasperExportManager.exportReportToPdf(jasperPrint);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_PDF);
		// para fazer download do relatório troque 'inline' por 'attachment'
		headers.add("Content-Disposition", "attachment; filename=usuarios.pdf");
		headers.setContentLength(file.length);

		return new ResponseEntity<>(file, headers, HttpStatus.OK);

	}

}
