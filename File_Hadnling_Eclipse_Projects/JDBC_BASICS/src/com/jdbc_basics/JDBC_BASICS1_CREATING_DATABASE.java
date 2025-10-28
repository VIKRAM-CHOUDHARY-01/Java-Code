package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_BASICS1_CREATING_DATABASE {
	
	public static void main(String[] args) throws Exception{
		
		//Step 1 : Load the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 : Get the Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "root");
		
		//Step 3 : Create the statement
		
		Statement stmt = conn.createStatement();
		
		
		//Step 4 : Process the Result
		
		int rowsAffected = stmt.executeUpdate("CREATE DATABASE db_new");
		System.out.println(rowsAffected);
		
		//Step 5: close the connection
		
		conn.close();
		
	}

}
