package com.evolution.email;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;

public class EnviarSenha {

	@Autowired
	private EmailService emailService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void sendMail() throws MessagingException, IOException {

		Mail mail = new Mail();
		mail.setFrom("evolutionsistemas@gmail.com");
		mail.setTo("ederaparecidoleite2013@gmail.com");
		mail.setSubject("Sending Email with Thymeleaf HTML Template Example");

		Map model = new HashMap();
		model.put("name", "Memorynotfound.com");
		model.put("location", "Belgium");
		model.put("signature", "https://memorynotfound.com");
		mail.setModel(model);

		emailService.sendSimpleMessage(mail, "email-template");
	}
}
