package org.pradeep.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class Employee
{
	private int id;
	private String name;
	private long salary;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public long getSalary()
	{
		return salary;
	}

	public void setSalary(long salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Pradeep");
		e1.setSalary(20000);

		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Sai");
		e2.setSalary(20);

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("Kumar");
		e3.setSalary(13000);

		Employee e4 = new Employee();
		e4.setId(4);
		e4.setName("Sure");
		e4.setSalary(2000021);

		Employee e5 = new Employee();
		e5.setId(5);
		e5.setName("Venkata");
		e5.setSalary(200002);

		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		
		Employee.sort(list, SORT_METHOD.BYSAL);
		
		
		//Collections.sort(list);
		
		
		

		
		  for (Employee emp : list) { System.out.println(emp); }
		 
	}

	/*
	 * @Override public int compareTo(Employee o) { if (this.id > o.id) return 1; if
	 * (this.id < o.id) return -1; return 0; }
	 */

	public enum SORT_METHOD
	{
		BYNAME, BYSAL
	}
	
	
	public static void sort(final List<Employee> employees, final SORT_METHOD method)
	{
		Function<Employee,String> byName= e -> e.getName();
		Function<Employee,Long> byAge =e-> e.getSalary();
		
		if (SORT_METHOD.BYNAME == method) 
		{
			Collections.sort(employees, Comparator.comparing(byName).thenComparing(byAge));
		} 
		else 
		{
			Collections.sort(employees, Comparator.comparing(byAge).thenComparing(byName));
		}
	}

	/*
	 * @Override public int compare(Employee o1, Employee o2) {
	 * if(o1.getId()>o2.getId()) return 1; if(o1.getId()<o2.getId()) return -1;
	 * return 0; }
	 */

}
