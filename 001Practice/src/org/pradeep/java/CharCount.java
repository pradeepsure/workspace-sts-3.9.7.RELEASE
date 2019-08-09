package org.pradeep.java;

public class CharCount
{
	public static void main(String[] args)
	{
		String s1="Hello";
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='l')count++;
		}
		System.out.println(count);
	}
}