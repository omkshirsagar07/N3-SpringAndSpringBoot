package org.tnsif.autowireExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SonySabExecutor {

	
	public static void main(String[] args) {
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		TarakMehtaKaUltaChashma T = c.getBean("TMKUC",TarakMehtaKaUltaChashma.class);
		T.JaiJinendra();

	}

}
