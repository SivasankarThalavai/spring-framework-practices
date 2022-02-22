package com.sivasankar.springcore.practices.scopes.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // is must if you are not instantate a bean in app config
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class AccountService {

	private String accountHolder;

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

}