package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_BASIC1_CREATING_DB_Prac  {
public static void main(String[] args) throws Exception {
	//Step 1 : Load the Driver class
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Step 2: Create the Connection
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
	
	//Step 3 : Prepare the statement
	Statement stmt = conn.createStatement();
	
	//Step 4 : Execute the Query
	int rowAffected = stmt.executeUpdate("CREATE DATABASE star");
	System.out.println(rowAffected);
	
	//Step 5 : Close the connection
	conn.close();
	
	
	
}
}
