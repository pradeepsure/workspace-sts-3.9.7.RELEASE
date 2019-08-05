package org.pradeep;

public class Singleton {

	private static Singleton s = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getData() {
		if(s==null) {
			s= new Singleton();
		}
		return s;
	}
	
	public static void main(String[] args) {

	}

}
