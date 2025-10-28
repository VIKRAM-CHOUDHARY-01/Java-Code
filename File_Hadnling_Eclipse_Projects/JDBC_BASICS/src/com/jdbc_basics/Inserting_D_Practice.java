package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Inserting_D_Practice {
	public static void main(String[] args) throws Exception {
		
		//Step 1 : Load the Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2: Create the Connection
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/star", "root", "root");
		
		//Step 3 : Create the Statement
		
		Statement stmt = conn.createStatement();
		
		//Step 4 : Execute the Query
		
		int rowAffected = stmt.executeUpdate("INSERT INTO weeknd VALUES (1, 'Blinding Lights', '2019-11-29'), (2, 'Save Your Tears', '2020-08-09'),(3, 'Starboy', '2016-09-22'), (4, 'The Hills', '2015-05-27'), (5, 'Can’t Feel My Face', '2015-06-08')");
		
		//Step 5 : Close the Connection
		conn.close();
	}

}
