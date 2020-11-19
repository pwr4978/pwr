package org.kg.myapp;

import java.lang.reflect.Field;

public class MyContext {

	public <T> T getInstance(Class c) throws InstantiationException, IllegalAccessException {
	// <T> generic 검 T return
	T obj=(T)c.newInstance();
	obj=runAnnotation(obj);
	return obj;
	
	}
	
	public <T> T runAnnotation(T obj) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
	Field[] fields = obj.getClass().getDeclaredFields();
	for(Field f : fields) {
		
		MyAnnotation anno = f.getAnnotation(MyAnnotation.class);
		if(anno != null) {
			f.setAccessible(true);
			f.set(obj, f.getType().newInstance());
		}
	}
	
	return obj;
	}
	
}
