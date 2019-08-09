package org.pradeep.java;

public class Runna
{
	public static void main(String[] args)
	{
		new Thread(new RunnableClass()).start();
		for(int j=16;j<=40;j++)
		{
			System.out.println(j);
			try
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class RunnableClass implements Runnable
{
	public void run()
	{
		for(int i=1;i<=15;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
