package org.tnsif.objectsInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIUsingObjects {

	public static void main(String[] args) {
		BeanFactory F = new ClassPathXmlApplicationContext("beans1.xml");
		charger B = F.getBean("charger1",charger.class);
		System.out.println(B);
	
	}

}
