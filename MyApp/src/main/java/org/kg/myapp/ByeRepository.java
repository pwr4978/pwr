package org.kg.myapp;

import org.springframework.stereotype.Repository;

@Repository
public class ByeRepository implements IHelloRepository{

	@Override
	public String sayHello(String name) {
		return name+"님 안녕하세요!(MySQL)";
		
	}
	
}

