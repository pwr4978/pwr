package org.kg.myapp.emp.main;

import org.kg.myapp.emp.model.dao.IEmpService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext con = new GenericXmlApplicationContext("app.xml");
		IEmpService empService = con.getBean(IEmpService.class);
		System.out.println("사원의 수 : "+empService.getEmpCount());
		System.out.println("사원 목록 : ");
		System.out.println(empService.getEmpList());
	}

}
