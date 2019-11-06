package org.pradeep.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadConsept1
{
	public static void main(String[] args)
	{
		//get the count of available cores in your cpu
		int coreCount = Runtime.getRuntime().availableProcessors();
		//Create the pool
		ExecutorService ec = Executors.newCachedThreadPool(); //Executors.newFixedThreadPool(coreCount);
		for(int i=0;i<100;i++) 
		{
			//Thread t = new Thread(new Task());
			//t.start();
			ec.execute(new Task());
			System.out.println("Thread Name under main method:-->"+Thread.currentThread().getName());
		}
		
		//for scheduling tasks
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		//task to run repetatively 10 seconds after previous taks completes
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
		
	}
}

class Task implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("Thread Name:-->"+Thread.currentThread().getName());
	}
}