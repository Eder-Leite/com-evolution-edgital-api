package com.evolution.exceptionhandler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class EvolutionExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String message = "Mensagem inválida.";
		List<Erro> erros = Arrays.asList(new Erro(message));
		return handleExceptionInternal(ex, erros.get(0), headers, HttpStatus.BAD_REQUEST, request);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		List<Erro> erros = criarListaDeErros(ex.getBindingResult());
		return handleExceptionInternal(ex, erros.get(0), headers, HttpStatus.BAD_REQUEST, request);
	}

	@ExceptionHandler({ EmptyResultDataAccessException.class })
	public ResponseEntity<Object> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex,
			WebRequest request) {
		String message = "Registro não encontrado.";
		List<Erro> erros = Arrays.asList(new Erro(message));
		return handleExceptionInternal(ex, erros.get(0), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}

	@ExceptionHandler({ DataIntegrityViolationException.class })
	public ResponseEntity<Object> handleDataIntegrityViolationException(DataIntegrityViolationException ex,
			WebRequest request) {
		String message = "Você não tem permissão para acessar esse recurso.";
		List<Erro> erros = Arrays.asList(new Erro(message));
		return handleExceptionInternal(ex, erros.get(0), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}

	@ExceptionHandler({ org.hibernate.exception.GenericJDBCException.class })
	public ResponseEntity<Object> GenericJDBCException(org.hibernate.exception.GenericJDBCException ex,
			WebRequest request) {
		String message = ex.getMessage();
		List<Erro> erros = Arrays.asList(new Erro(message));
		return handleExceptionInternal(ex, erros.get(0), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}

	@ExceptionHandler({ com.evolution.service.NegocioExceptionService.class })
	public ResponseEntity<Object> ExceptionService(com.evolution.service.NegocioExceptionService ex, WebRequest request) {
		String message = ex.getMessage();
		List<Erro> erros = Arrays.asList(new Erro(message));
		return handleExceptionInternal(ex, erros.get(0), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}

	private List<Erro> criarListaDeErros(BindingResult bindingResult) {
		List<Erro> erros = new ArrayList<>();

		for (FieldError fieldError : bindingResult.getFieldErrors()) {
			String message = messageSource.getMessage(fieldError, LocaleContextHolder.getLocale());
			erros.add(new Erro(message));
		}

		return erros;
	}

	public static class Erro {

		private String message;

		public Erro(String message) {
			this.message = message;
		}

		public String getMessage() {
			return message;
		}

	}

	public String getMensangemOracle(String value) {
		int fim = 0;
		char b = '#';
		for (int i = 0; i < value.length(); i++) {
			if (value.charAt(i) == b) {
				fim = i;
			}
		}

		if (fim >= 11) {
			return value.substring(11, fim);
		} else {
			return value;
		}
	}

	public String getMensangemNegocioExceptionService(String value) {
		return value.substring(24, value.length());
	}
}
