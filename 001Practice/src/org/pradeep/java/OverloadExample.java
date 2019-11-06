package org.pradeep.java;

public class OverloadExample
{
	static void m1(Object obj) {
		System.out.println("Object");
	}
	static void m1(String s) {
		System.out.println("String");
	}
	
	public static void main(String[] args)
	{
		//Object obj =null;
		m1(null);
	}

}
