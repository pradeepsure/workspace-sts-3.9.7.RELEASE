package org.pradeep.java;

class Stock
{
	private int stockCars=5;
	private static final Stock stock=new Stock();
	private Stock()
	{
		
	}
	public static Stock getInstance()
	{
		//System.out.println(stock);
		return stock;
	}
	synchronized void consume(int n)
	{
		System.out.println("Consumer need "+n +"Cars");
		System.out.println("Curent stock is "+stockCars);
		if(stockCars < n)
		{
			System.out.println("Stock is less.... wait for some time");
			try
			{
				wait();
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			stockCars=stockCars-n;
			System.out.println("Consumer blocked "+n +"Cars");
		}
	}
	synchronized void produce(int n)
	{
		System.out.println("Manifatured "+n+"Cars");
		stockCars=stockCars+n;
		System.out.println("Producer updated "+n+"Cars");
		System.out.println("Cars stock = "+stockCars );
		notifyAll();
	}
}
class ProducerThread implements Runnable
{
	int n;
	ProducerThread(int n)
	{
		this.n=n;
	}
	public void run()
	{
		Stock.getInstance().produce(n);
	}
}

class ConsumerThread implements Runnable
{
	int n;
	ConsumerThread(int n)
	{
		this.n=n;
	}
	public void run()
	{
		Stock.getInstance().consume(n);
	}
}
public class RunSynchro
{
	public static void main(String[] args)
	{
		new Thread(new ConsumerThread(8)).start();
		try
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		new Thread(new ProducerThread(10)).start();
	}
}
