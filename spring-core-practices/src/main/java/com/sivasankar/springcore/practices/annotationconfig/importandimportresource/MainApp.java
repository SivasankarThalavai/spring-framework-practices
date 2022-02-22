package com.sivasankar.springcore.practices.annotationconfig.importandimportresource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigC.class);

		BeanA beanA = context.getBean(BeanA.class);
		beanA.doSomething();

		BeanB beanB = context.getBean(BeanB.class);
		beanB.doSomething();

		BeanC beanC = context.getBean(BeanC.class);
		beanC.doSomething();

		context.close();
	}
}