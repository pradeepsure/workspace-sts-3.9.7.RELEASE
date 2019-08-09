package org.pradeep.java;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountingWordsInString
{
	public static void main(String[] args)
	{
		String s="pradeep kumar how are you";
		s=s.replace(" ", "");
		Map<Character,Integer> count=new LinkedHashMap<Character,Integer>();
		for(char ch:s.toCharArray())
		{
			if(count.containsKey(ch))
			{
				count.put(ch, (Integer)count.get(ch)+1);
			}
			else
			{
				count.put(ch, 1);
			}
		}
		System.out.println(count);
		Set<Entry<Character, Integer>> set = count.entrySet();
		Iterator<Entry<Character, Integer>> iterator = set.iterator();
		while(iterator.hasNext())
		{
			Entry<Character, Integer> en = iterator.next();
			if(en.getValue()>1)
			{
				System.out.println("Character : "+en.getKey()+" duplication : "+en.getValue());
			}
				
		}
		String s2="pradeep kumar how are you how are you";
		String[] splitted =s2.split(" ");
		Map<String,Integer> countWords=new LinkedHashMap<String,Integer>();
	    for (int i=0; i<splitted.length ; i++) 
	    {
	        if (countWords.containsKey(splitted[i])) 
	        {
	        	countWords.put(splitted[i], (Integer)countWords.get(splitted[i])+1);
	        	/*int cont = countWords.get(splitted[i]);
	              countWords.put(splitted[i], cont + 1);*/
	        } 
	        else 
	        {
	        	 countWords.put(splitted[i], 1);
	        }
	     }
	     System.out.println(countWords);
	     
	     String string="hey how are you";
	     string=string.replace(" ","");
	     Map<Character,Integer> countLetters=new LinkedHashMap<Character,Integer>();
	     for(char ch:string.toCharArray())
	     {
	    	 if(countLetters.containsKey(ch))
	    	 {
	    		 countLetters.put(ch, (Integer)countLetters.get(ch)+1);
	    	 }
	    	 else
	    	 {
	    		 countLetters.put(ch, 1);
	    	 }
	     }
	     System.out.println(countLetters);
	     
	     String str="hey taxexemption and vai hey vai";
	     String[] strSplit=str.split(" ");
	     Map<String,Integer> wordsCount=new LinkedHashMap<String,Integer>();
	     for(int i=0;i<strSplit.length;i++)
	     {
	    	 if(wordsCount.containsKey(strSplit[i]))
	    	 {
	    		 wordsCount.put(strSplit[i], (Integer)wordsCount.get(strSplit[i])+1);
	    	 }
	    	 else
	    	 {
	    		 wordsCount.put(strSplit[i],1);
	    	 }
	     }
	     System.out.println(wordsCount);
	}
}