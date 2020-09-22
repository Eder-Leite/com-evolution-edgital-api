package com.evolution.mail;

import java.io.IOException;

import javax.mail.MessagingException;

public interface EmailService {

	public void sendSimpleMessage(Mail mail, String template) throws MessagingException, IOException;
	
}
