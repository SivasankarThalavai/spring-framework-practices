package com.sivasankar.springcore.practices.scopes.prototpe;

/*  
 *  When a spring bean is scoped as a prototype, the Spring IoC container creates new bean instance every time
 *  when a request is made for that bean.
 *  
 *  define the scope of a bean as prototype using scope="prototype" 
*/

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AccountService service1 = context.getBean("accountService", AccountService.class);
		service1.setAccountHolder("Sivasankar");
		System.out.println(service1.getAccountHolder());

		AccountService service2 = context.getBean("accountService", AccountService.class);
		System.out.println(service2.getAccountHolder());
		context.close();
	}
}