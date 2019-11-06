package org.pradeep.java;

import java.util.LinkedList;

class Animal{
	public void speak() {
		System.out.println("Animal..");
	}
}

class Dog extends Animal{
	@Override
	public void speak() {
		System.out.println("Dog...");
	}
}

class Cat extends Animal{
	@Override
	public void speak() {
		System.out.println("cat");
	}
}
public class Poly
{
	public static void main(String[] args)
	{
		Animal a = new Dog();
		Dog d = (Dog)a;
		d.speak();
		
		LinkedList al = new LinkedList();
		
		
		/*
		 * SuperClass superClass1 = new SuperClass(); 
		 * SuperClass superClass2 = new SubClass();
		 * 
		 * //Valid down casting 
		 * SubClass subClass1 = (SubClass)superClass2;
		 * subClass1.method();
		 */

	}
}
