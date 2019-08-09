package org.pradeep.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class CalculateCharFromStr
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String input = s.nextLine();
		input = input.replace(" ", "");
		findDuplicateChar(input);
		s.close();
	}
	private static void findDuplicateChar(String input)
	{
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		char[] ch = input.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (hashMap.containsKey(String.valueOf(ch[i])))
			{
				hashMap.put(String.valueOf(ch[i]), hashMap.get(String.valueOf(ch[i])) + 1);
			}
			else
			{
				hashMap.put(String.valueOf(ch[i]), 1);
			}
		}
		System.out.println(hashMap);
		Set<Entry<String, Integer>> set = hashMap.entrySet();
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while (iterator.hasNext())
		{
			Entry<String, Integer> en = iterator.next();
			if (en.getValue() > 1)
			{
				System.out.println("Character : " + en.getKey() + " duplication : " + en.getValue());
			}
		}
	}
}