package org.pradeep;

import java.util.Scanner;

public class ArmstrongExample
{
	public static void main(String[] args) 
	{
		int c=0,tmp,a;
		int n;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your number we will tell that number is armstrong or not");
		n=scn.nextInt();
		System.out.println(n);
		tmp=n;
		while(n>0) 
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(tmp==c)
			System.out.println("Given Number is Armstrong");
		else
			System.out.println("not an armstron");
	}  
}
