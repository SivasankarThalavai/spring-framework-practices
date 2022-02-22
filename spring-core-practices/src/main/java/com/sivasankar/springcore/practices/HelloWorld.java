package com.sivasankar.springcore.practices;

public class HelloWorld {
	
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("My Message : " + message);
	}
	
	public String showMessage() {
		return message;		
	}
}