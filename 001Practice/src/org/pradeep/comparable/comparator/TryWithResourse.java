package org.pradeep.comparable.comparator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourse
{

	public static void main(String[] args)
	{
		TryWithResourse trywith = null; 
		TryWithResourse.objCalling();
	}
	
	private static void objCalling()
	{
		System.out.println("NullPointerException--->");
	}

	public void checkingTryWithResourse() throws FileNotFoundException, IOException
	{
		try(FileReader fr = new FileReader("abc.txt")) 
		{
			
		}
		/*catch(Exception e) {
			
		}*/
		/*finally {
			
		}*/
	}

}
