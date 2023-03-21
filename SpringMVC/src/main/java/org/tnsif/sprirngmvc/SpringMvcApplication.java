package org.tnsif.sprirngmvc;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication // this spring boot annotation that commonly used annotation; which contains @configuration , @EnableAutoconfiguration ,(@ComponentScan-(@service,@repositories))
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringMvcApplication.class, args);
		Scanner sc = new Scanner(System.in);
//		/*int x = sc.nextInt();
//		System.out.println(x);
//		 */
//		
//		Employee e = context.getBean(Employee.class);
//		e.setEmpID(sc.nextInt());
//		e.setEmpname(sc.next());
//		e.print();
		
		HomeController h = context.getBean(HomeController.class);
		h.home();
		
	}

}
