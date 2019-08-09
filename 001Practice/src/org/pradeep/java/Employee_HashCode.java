package org.pradeep.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Employee_HashCode
{
	int empId;
	String panNumber;
	Employee_HashCode(int empId,String panNumber)
	{
		this.empId=empId;
		this.panNumber=panNumber;
	}
	public boolean equals(Object obj)
	{
		
		if(!(obj instanceof Employee_HashCode))
		{
			//System.out.println("Equals Method is execting here ==> 1");
			return false;
		}
		if(obj == this)
		{
			//System.out.println("Equals Method is execting here ==> 2");
			return true;
		}
		Employee_HashCode e3=(Employee_HashCode)obj;
		if((e3.empId==empId) && panNumber.equals(e3.panNumber))
		{
			//System.out.println("Equals Method is execting here ==> 3");
			return true;
		}
		return false;
	}
	public int hashCode()
	{
		return empId+panNumber.hashCode();
	}
	public String toString()
	{
		return empId+" "+panNumber;
	}
	public static void main(String[] args)
	{
		Employee_HashCode e1= new Employee_HashCode(1,"cqpt88088");
		Employee_HashCode e2= new Employee_HashCode(2,"cqpt88088");
		Employee_HashCode e3= new Employee_HashCode(1,"cqpt88088");
		System.out.println(e1.equals(e2));
		System.out.println(e3.equals(e1));
		Set<Employee_HashCode> s=new HashSet<Employee_HashCode>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		System.out.println(s);
		Map<Employee_HashCode,String> m=new HashMap<Employee_HashCode,String>();
		m.put(e1, "HelloWorld");
		m.put(e3, "Hello");
		System.out.println(m);
	}
}