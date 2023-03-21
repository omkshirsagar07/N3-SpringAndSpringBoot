package org.tnsif.sprirngmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/* @controller contains a bussiness logic of an app */
@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Code to demonstrate on simple web application");
		return "home.jsp";
	}

}
