package org.pradeep.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgrammingRunner
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Cat");
		list.add("Bat");
		list.add("Rat");
		// printBasicWithFiltering(list);
		printFPWithFiltering(list);
	}

	public static void printBasicWithFiltering(List<String> list)
	{
		for (String str : list) {
			if (str.endsWith("at")) {
				System.out.println(str);
			}
		}
	}

	public static void printFPWithFiltering(List<String> list)
	{
		List li = list.stream().filter(elem -> elem.endsWith("at")).collect(Collectors.toList());
		System.out.println(li);

	}
}
