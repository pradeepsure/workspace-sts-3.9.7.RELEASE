package org.pradeep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class noOfChars 
{
	public static void main(String[] args) 
	{
		String s = "h1h33hhel";
		String s1=s.replace(" ", "");
		findDuplicateChars(s1);
	}
	public static void findDuplicateChars(String s) 
	{
		Map<Character,Integer> m = new HashMap<>();
		for(char c: s.toCharArray()) {
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			}
			else {
				m.put(c,1);
			}
		}
		System.out.println(m);
		Set<Entry<Character,Integer>> set = m.entrySet();
		Iterator<Entry<Character,Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Character, Integer> c = itr.next();
			if(c.getValue()>1) {
				System.out.println("duplicate char  "+c.getKey()+"  repeated times"+c.getValue());
			}
		}
		
	}
}
