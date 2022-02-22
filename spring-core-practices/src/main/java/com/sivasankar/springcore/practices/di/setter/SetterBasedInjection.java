package com.sivasankar.springcore.practices.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sivasankar.springcore.practices.di.service.MessageService;

@Component
public class SetterBasedInjection {

	private MessageService messageService;

	@Autowired
	@Qualifier("SMSService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void processMsg(String message) {
		messageService.sendMsg(message);
	}
}