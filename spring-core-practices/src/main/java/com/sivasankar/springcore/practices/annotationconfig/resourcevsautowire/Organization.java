package com.sivasankar.springcore.practices.annotationconfig.resourcevsautowire;

import org.springframework.stereotype.Component;

@Component
public class Organization implements Party {

	@Override
	public String type() {
		return "Organization PArty";
	}
}