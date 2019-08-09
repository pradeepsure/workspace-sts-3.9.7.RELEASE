package org.pradeep.java;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int primeOrNot=scn.nextInt();
		int count=1;
		for(int div=2;div<=primeOrNot/2;div++)
		{
			if(primeOrNot%div==0)
			{
				count=0;
				break;
			}
		}
		System.out.println(count);
		if(count==1)
		{
			System.out.println("Given number is Prime");
		}
		else
		{
			System.out.println("Given number is NotPrime");
		}
		scn.close();
	}
}
