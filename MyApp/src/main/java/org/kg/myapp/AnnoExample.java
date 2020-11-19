package org.kg.myapp;

public class AnnoExample {

	@MyAnnotation
	java.util.Date name;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		MyContext con = new MyContext();
		AnnoExample a =con.getInstance(AnnoExample.class);
		System.out.println(a.name);
		
		
		
		
	}

}
