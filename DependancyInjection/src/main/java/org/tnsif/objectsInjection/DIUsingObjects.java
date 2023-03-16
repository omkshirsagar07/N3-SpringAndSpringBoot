package org.tnsif.objectsInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DIUsingObjects {

	public static void main(String[] args) {
		BeanFactory F = new ClassPathXmlApplicationContext("beans1.xml");
		cellPhone B = F.getBean("c2",cellPhone.class);
		B.accept();
	
	}

}
