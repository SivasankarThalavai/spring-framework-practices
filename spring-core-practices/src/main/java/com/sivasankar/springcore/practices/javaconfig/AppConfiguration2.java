package com.sivasankar.springcore.practices.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sivasankar.springcore.practices.di.service.MessageProcessor;
import com.sivasankar.springcore.practices.di.service.MessageProcessorImpl;
import com.sivasankar.springcore.practices.di.service.MessageService;
import com.sivasankar.springcore.practices.di.service.TwitterService;

@Configuration
public class AppConfiguration2 {

	@Bean(name = "twitterService")
	public MessageService twitterService() {
		return new TwitterService();
	}

	@Bean
	public MessageProcessor messageProcessor() {
		return new MessageProcessorImpl(twitterService());
	}
}