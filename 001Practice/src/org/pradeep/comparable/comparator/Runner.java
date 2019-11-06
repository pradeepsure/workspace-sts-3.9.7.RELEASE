package org.pradeep.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner
{

	public static void main(String[] args)
	{
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("hp",230,4));
		laps.add(new Laptop("lenovo",2430,6));
		laps.add(new Laptop("hp",1230,2));
		
		
		Comparator<Laptop> comp = new Comparator<Laptop>() 
		{
			@Override
			public int compare(Laptop l1, Laptop l2)
			{
				if(l2.getPrice()>l1.getPrice())
					return 1;
			else
				return -1;
			}
		};
		
		  
		Comparable<Laptop> comparable = new Comparable<Laptop>()
		{

			@Override
			public int compareTo(Laptop o)
			{
				
				return 0;
			}
	
		};
		
		
		Collections.sort(laps,(e1,e2) ->(e1.getPrice()<e2.getPrice()?-1:(e1.getPrice()>e2.getPrice()?1:0)));
		for(Laptop l: laps) {
			System.out.println(l);
		}
	}

	

}
