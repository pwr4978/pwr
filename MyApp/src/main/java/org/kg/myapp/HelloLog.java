package org.kg.myapp;

import org.springframework.stereotype.Component;

@Component
public class HelloLog {

	public void printTime() {
		System.out.println(new java.util.Date());
	}
}
