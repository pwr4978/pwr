package org.kg.myapp;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository implements IHelloRepository {

	
	
	
	public String sayHello(String name) {
		return name+"님 안녕하세요 !";
	
	}

}
