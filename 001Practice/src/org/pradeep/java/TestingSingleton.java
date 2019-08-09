package org.pradeep.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestingSingleton
{
	private static final TestingSingleton only_one = new TestingSingleton();
	private Connection con;
	private TestingSingleton()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pradeep?user=root&&password=hello");
		} 
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static TestingSingleton getInstance()
	{
		return only_one;
	}
	public Connection getCon()
	{
		return con;
	}
	public static void main(String[] args)
	{
		System.out.println("Main Starts");
		TestingSingleton tdbs= TestingSingleton.getInstance();
		@SuppressWarnings("unused")
		Connection con=tdbs.getCon();
		System.out.println("Main Ends");
	}
}
