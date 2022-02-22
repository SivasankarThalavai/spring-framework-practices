package com.sivasankar.springcore.practices.annotationconfig.lazy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*	By default, the Spring IoC container creates and initializes all singleton beans at time of application start up. 
 *  We can prevent this pre initialization of a singleton beans by using the @Lazy annotation.
*/

public class MainApp {
	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Initialize lazy bean
		BeanOne bean = context.getBean(BeanOne.class);
		bean.doSomthing();
		context.close();

	}
}