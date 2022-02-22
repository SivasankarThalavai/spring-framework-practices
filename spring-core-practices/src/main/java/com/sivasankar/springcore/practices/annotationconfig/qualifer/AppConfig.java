package com.sivasankar.springcore.practices.annotationconfig.qualifer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sivasankar.springcore.practices.annotationconfig.qualifer")
public class AppConfig {

}