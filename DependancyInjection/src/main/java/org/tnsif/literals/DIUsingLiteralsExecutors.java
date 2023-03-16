package org.tnsif.literals;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteralsExecutors {

	public static void main(String[] args) {
		BeanFactory F = new ClassPathXmlApplicationContext("beans.xml");
		BalenoEngine B = F.getBean("Thar",BalenoEngine.class);
		System.out.println(B);
		System.out.println(B.cost());
		System.out.println(B.display());

	}

}
