package org.kg.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

//	HelloRepository helloRepository = new HelloRepository();
	
	@Autowired 
	@Qualifier("byeRepository")//autowired랑 항상 같이 쓰임. 단독x
	IHelloRepository helloRepository;
	
//	public HelloService(HelloRepository helloRepository) {
//		this.helloRepository = helloRepository;
//	}
	
	public String sayHello(String name) {
		return helloRepository.sayHello(name);
		
		
	}
	
}
