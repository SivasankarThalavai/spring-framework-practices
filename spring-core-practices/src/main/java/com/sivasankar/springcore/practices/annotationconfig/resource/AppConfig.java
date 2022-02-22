package com.sivasankar.springcore.practices.annotationconfig.resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sivasankar.springcore.practices.annotationconfig.resource")
public class AppConfig {

}