package org.pradeep.java;

public class CheckingBit
{
	public static void main(String[] args)
	{
		int x = 23; // fifth bit is one as binary of 23 is 10111
		int fifthBit = (x & 16) / 16;
		System.out.println("Fifth bit of " + x +" is " + fifthBit);
	}
}
