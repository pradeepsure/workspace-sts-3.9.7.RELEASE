package org.pradeep.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorWithCallable
{
	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService service = Executors.newFixedThreadPool(10);
		List<Future> allFutures=new ArrayList<>();
		for(int i=0;i<100;i++)
		{
			Future<Integer> future=service.submit(new Task2());
			allFutures.add(future);
			
		}
		for(int i=0;i<100;i++)
		{
			Future<Integer> future = allFutures.get(i);
			Integer result=future.get();//blocking operation
			System.out.println("Result of Future #"+i+"="+result);
		}
	}
}

class Task2 implements Callable<Integer>
{

	@Override
	public Integer call() throws Exception
	{
		return new Random().nextInt();
	}
	
}
