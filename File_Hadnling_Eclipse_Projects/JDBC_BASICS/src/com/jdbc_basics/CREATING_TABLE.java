package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CREATING_TABLE {
public static void main(String[] args) throws Exception {
	
	//STEP : 1 LOAD THE DRIVER
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//STEP : 2 GET THE CONNECTION
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb1", "root", "root");
	
	//STEP : 3 CREATE THE STATMENT
	Statement stmt = conn.createStatement();
	
	//STEP : 4 EXECUTE THE QUERY
	
	int rowsAffacted = stmt.executeUpdate("CREATE TABLE student(id INT PRIMARY KEY, name VARCHAR(50))");
	System.out.println(rowsAffacted);
	
	//STEP : 5 CLOSE THE CONNECTION
	conn.close();
	
	
}
}
