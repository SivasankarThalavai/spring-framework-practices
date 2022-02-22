package com.sivasankar.springcore.practices.annotationconfig.importandimportresource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(value = { ConfigA.class })
@ImportResource(locations = {
		"classpath:/com.sivasankar.springcore.practices.annotationconfig.importandimportresource/configB.xml" })
public class ConfigC {
	@Bean
	public BeanC getBeanC() {
		return new BeanC();
	}
}