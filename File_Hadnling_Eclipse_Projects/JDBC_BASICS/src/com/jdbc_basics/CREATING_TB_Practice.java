package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CREATING_TB_Practice {

	public static void main(String[] args) throws Exception {
		//Step 1 : Load the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 : Create the connection
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/star", "root", "root");
		
		//Step 3: Create the Statement
		
		Statement stmt = conn.createStatement();
		
		//Step 4: Execute the Query
		
		int rowAffected = stmt.executeUpdate("CREATE TABLE Weeknd(id INT, song_name VARCHAR(100),realese_date DATE)");
		System.out.println(rowAffected);
		
		//Step 5 : Close the Connection
		conn.close();
		
	}
}
