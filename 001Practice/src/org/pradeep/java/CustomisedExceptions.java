package org.pradeep.java;

import java.util.Scanner;

class Account
{
	private int bal;
	Account(int bal)
	{
		this.bal=bal;
	}
	public int getBalence()
	{
		return bal;
	}
	public void withDraw(int amt) throws InssufficentBalException 
	{
		if(bal>=amt)
		{
			bal=bal-amt;
		}
		else
		{
			String msg="YOU Have Less Balence";
			throw new InssufficentBalException(msg);
		}
	}
	public void deposit(int amt)
	{
		bal=bal+amt;
		System.out.println("your Updated Balence is "+bal);
	}
}
@SuppressWarnings("serial")
class InssufficentBalException extends Exception
{
	private String msg;
	InssufficentBalException(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return msg;
	}
	public String getMessage()
	{
		return msg;
	}
}

public class CustomisedExceptions
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Account account=new Account(1000);
		String a;
		do
		{
			System.out.println("Type your Option");
			System.out.println("Type 1 For Bal");
			System.out.println("Type 2 for Deposit");
			System.out.println("Type 3 for Withdraw");
			int option=scan.nextInt();
			if(option==1)
			{
				System.out.println("Current Balence is : "+account.getBalence()+"Rs");
			}
			else if(option ==2)
			{
				System.out.println("How Much amount you want to Deposit please Enter Here");
				int amt=scan.nextInt();
				account.deposit(amt);
				System.out.println("Your Deposit is Success");
			}
			else if(option == 3)
			{
				System.out.println("How much amount you wnat to withdraw");
				int amt=scan.nextInt();
				try
				{
					account.withDraw(amt);
					System.out.println("Collect your Cash "+amt);
				}
				catch(InssufficentBalException exc)
				{
					System.out.println(exc.getMessage());
				}
				finally
				{
					scan.close();
				}
			}
			else
			{
				System.out.println("Invalid option you selected Please try again");
			}
			System.out.println("Do you want to Continue? (Y/N)");
			a=scan.next();
		}
		while(a.equalsIgnoreCase("Y"));
	}
}
