package org.tnsif.usingautowireanotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("remote.xml");
		Remote r = c.getBean("remote",Remote.class);
		r.remote();
	}

}
