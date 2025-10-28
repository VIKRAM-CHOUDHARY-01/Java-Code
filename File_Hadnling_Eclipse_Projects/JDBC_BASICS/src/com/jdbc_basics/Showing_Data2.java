package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Showing_Data2 {
	private static final String DBURL = "jdbc:mysql://localhost:3306/star";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "root";
	private static final String SELECTQUERY = "SELECT * FROM weeknd";
	
	public static void main(String[] args) throws Exception {
		//Step 1 -> LOADING DRIVER CLASS
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 2 -> Creating Connection
		
		Connection conn = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		
		// Step 3 -> Creating Statement
		Statement stmt = conn.createStatement();
		
		//Step 4 -> Execute Statement
		
		ResultSet rt = stmt.executeQuery(SELECTQUERY);
		// WE NEED TO MOVE THE CURSOR FIRST TO PRINT SOMETHING, SINCE RT
		//CURSOR POINTS BEFORE FIRST ROW THUS WE NEED THAT TO MOVE TO FIRST ROW AND SO ON
		
	
		while(rt.next()) {
			System.out.printf("%-5s %-20s %-20s%n",
			        rt.getString(1),
			        rt.getString(2),
			        rt.getString(3));
		}
		
		
		//Step 5 -> Close the connection
		
		conn.close();
		
	
		
		
	}

}
