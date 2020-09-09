package com.evolution.config.token;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import com.evolution.model.seguranca.AcessoUsuario;
import com.evolution.repository.seguranca.AcessoUsuarioRepository;
import com.evolution.security.UsuarioSistema;

public class CustomTokenEnhancer implements TokenEnhancer {

	@Autowired
	private AcessoUsuarioRepository acessoUsuarioRepository;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		UsuarioSistema usuarioSistema = (UsuarioSistema) authentication.getPrincipal();

		Map<String, Object> addInfo = new HashMap<>();

		addInfo.put("email", usuarioSistema.getUsuario().getEmail());
		addInfo.put("nome", usuarioSistema.getUsuario().getNome());
		addInfo.put("usuario", usuarioSistema.getUsuario().getId());
		addInfo.put("empresa", usuarioSistema.getUsuario().getFilial().getEmpresa().getId());
		addInfo.put("filial", usuarioSistema.getUsuario().getFilial().getId());

		// ultimo acesso baseado no login
		AcessoUsuario acesso = new AcessoUsuario();
		acesso.setUsuario(usuarioSistema.getUsuario());
		acessoUsuarioRepository.save(acesso);

		addInfo.put("dataToken", accessToken.getExpiration().getTime());

		Object obj = accessToken.getRefreshToken();

		Class<?> classe = obj.getClass();
		Field[] campos = classe.getDeclaredFields();

		for (Field campo : campos) {
			try {
				if (campo.getName().equals("expiration")) {
					campo.setAccessible(true);

					Date dataRefreshToken = (Date) campo.get(obj);

					addInfo.put("dataRefreshToken", dataRefreshToken.getTime());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(addInfo);
		return accessToken;
	}

	public void imprimeAtributoseValoresPojo(Object object) {
		Class<?> classe = object.getClass();
		Field[] campos = classe.getDeclaredFields();

		String nomeAtributo = "";
		Object valorAtributo = null;
		for (Field campo : campos) {
			try {
				nomeAtributo = campo.getName();
				campo.setAccessible(true);
				valorAtributo = campo.get(object);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(nomeAtributo + ": " + valorAtributo);
		}
	}

}
