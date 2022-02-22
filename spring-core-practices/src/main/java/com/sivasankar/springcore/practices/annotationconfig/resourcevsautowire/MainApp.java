package com.sivasankar.springcore.practices.annotationconfig.resourcevsautowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sivasankar.springcore.practices.annotationconfig.requiredDemo.AppConfig;

public class MainApp {

	public static void main(String[] args) {

		// Scenario 1 : Inject using Interface type – Using @Resource or @Inject or

		// @Autowired ---------------------- none of this will work

		// org.springframework.beans.factory.NoSuchBeanDefinitionException
		// No qualifying bean of type
		// 'com.sivasankar.springcore.practices.annotationconfig.resourcevsautowire.PartyKeeper'
		// available

		/*
		 * All the annotations are doing the same thing that is trying to inject the
		 * dependency by Type. Type is Animal but it has 2 implementations (Tiger and
		 * Lion). Hence stuck with ambiguity exception.
		 */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// PartyKeeper partKeeper = context.getBean(PartyKeeper.class);
		// System.out.println(partKeeper.getParty().type());
		context.close();

		// Scenario 2 : Inject using field type as concrete class:- Using @Resource or
		// @Inject or @Autowire

//		All the annotations get successful injection.
//
//		Reason – All are trying to inject by type and type of the Animal is concrete class Tiger hence no ambiguity for injecting.
////		
//		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//		PartyKeeper partKeeper1 = context1.getBean(PartyKeeper.class);
//		System.out.println(partKeeper1.getParty());
//		context1.close();

		// Scenario 3 : Injecting using field name:- Using @Resource or @Inject or
		// @Autowired

//		All the annotations will inject successfully.
//
//		Reason : It’s injecting by name , 
//		whenever we use @Component on the class, automatically class name itself is registered as a spring bean.

//		Organization class organization as organization with container and organization bean is only one available inside container so no ambiguity.

		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
		PartyKeeper partKeeper1 = context1.getBean(PartyKeeper.class);
		System.out.println(partKeeper1.getParty());
		context1.close();

		// Scenario 4 : Using Qualifier with correct qualifier name:- Using @Resource or
		// @Inject or @Autowired
	}

}
