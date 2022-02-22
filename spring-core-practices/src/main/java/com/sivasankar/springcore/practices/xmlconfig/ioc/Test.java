package com.sivasankar.springcore.practices.xmlconfig.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
 *  BeanFactory and ApplicationContext is that BeanFactory only instantiates bean when we call getBean() method
	while 
	ApplicationContext instantiates singleton bean when the container is started, 
	It doesn't wait for getBean() method to be called.
*/
public class Test {

	public static void main(String[] args) {

		// 1.) BeanFactory (Lazy Loading)
		Resource resource = new ClassPathResource("applicationContext.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		Customer customerBean1 = (Customer) factory.getBean("customerBean");
		customerBean1.displayInfo();

		// 2.) ApplicationContext
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Customer customerBean2 = (Customer) applicationContext.getBean("customerBean");
		customerBean2.displayInfo();

		applicationContext.close();

	}
}
