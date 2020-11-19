package org.kg.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

//	HelloService helloService = new HelloService();
	
	@Autowired
	HelloService helloService;
	
//	public HelloController(HelloService helloService) {
//		this.helloService = helloService;
//	}
	
	
	
	public void sayHello(String name) {
		
		System.out.println(helloService.sayHello(name));
	
		
	}
	
}
