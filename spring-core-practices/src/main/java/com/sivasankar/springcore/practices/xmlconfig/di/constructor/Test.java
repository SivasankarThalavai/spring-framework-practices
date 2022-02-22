package com.sivasankar.springcore.practices.xmlconfig.di.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e1 = (Employee) factory.getBean("employeeBean");
		e1.show();

		Employee e2 = (Employee) factory.getBean("employeeInheritAddressBean");
		e2.show();

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Question questionBean1 = (Question) context.getBean("questionBean");
		questionBean1.displayInfo();

	}
}