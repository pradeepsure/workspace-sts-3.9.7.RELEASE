package org.pradeep.java;

public class MyThread
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		Thread thread=new MyFirstThread();
		thread.start();
		for(int i=0;i<=20;i++)
			
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

class MyFirstThread extends Thread
{
	public void run()
	{
		for(int j=21;j<=40;j++)
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


