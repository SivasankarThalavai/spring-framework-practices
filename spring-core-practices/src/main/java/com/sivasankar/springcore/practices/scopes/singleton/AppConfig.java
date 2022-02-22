package com.sivasankar.springcore.practices.scopes.singleton;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sivasankar.springcore.practices.scopes") // is must if you are using @Component in
																			// first lien of a classes
public class AppConfig {

}