package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Inserting_Data {
	public static void main(String[] args) throws Exception {
		
		//STEP : 1 LOAD THE DRIVER
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//STEP : 2 CREATE THE CONNECTION
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb1", "root", "root");
		
		//STEP : 3 CREATE THE STATEMENT
		
		Statement stmt = conn.createStatement();
		
		//STEP : 4 EXECUTE THE STATEMENT
		
		int rowsAffected = stmt.executeUpdate("INSERT INTO person VALUES (1,'Vikram'), (2,'Roland');");
		System.out.println(rowsAffected);
		
		//STEP : 5 CLOSE THE CONNECTION
		
		conn.close();
		
	}

}
