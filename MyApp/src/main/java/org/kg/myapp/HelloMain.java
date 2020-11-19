package org.kg.myapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
//		HelloController helloController = new HelloController();
		
		AbstractApplicationContext con = new GenericXmlApplicationContext("app.xml");
		HelloController helloController = con.getBean(HelloController.class);
		helloController.sayHello("염형섭");
		
		
	}

}

