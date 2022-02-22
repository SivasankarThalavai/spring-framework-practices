package com.sivasankar.springcore.practices.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("EmailService")
public class EmailService implements MessageService {

	public void sendMsg(String message) {
		System.out.println("From EmailService Impl Class : " + message);
	}
}