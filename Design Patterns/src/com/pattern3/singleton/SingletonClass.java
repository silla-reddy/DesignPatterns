package com.pattern3.singleton;

public class SingletonClass {
	
	String var="test2";
	
	private SingletonClass() {
		System.out.println("instance created");
	}
	
	private static SingletonClass obj;
	
	public static SingletonClass getInstance() {
		if(obj==null)
			obj=new SingletonClass();
		
		return obj;
	}
	
	

}
