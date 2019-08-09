package org.pradeep.java;

import java.util.HashMap;
import java.util.Map;

public class Run
{
	public static void main(String[] args)
	{
		User user1 = new User("123", 35, "111222333");
	    User user2 = new User("123", 35, "111222333");
	    Map<User,String> m=new HashMap<User,String>();
	    m.put(user1, "Hello");
	    m.put(user2, "World");
	    System.out.println(user1.equals(user2)+" "+user1+" "+m);
	}
}
