package com.sivasankar.springcore.practices.annotationconfig.customqualifier.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sivasankar.springcore.practices.annotationconfig.customqualifier")
public class AppConfig {

}