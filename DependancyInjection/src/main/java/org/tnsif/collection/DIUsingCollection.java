package org.tnsif.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingCollection {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("collection.xml");
		CollectionDemo d = c.getBean("collection",CollectionDemo.class);
		d.display();
	}

}
