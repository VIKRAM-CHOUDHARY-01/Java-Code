package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Showing_Data_Practice {
	private static final String DBURL = "jdbc:mysql://localhost:3306/star";
	private static final String DBUSERNAME = "root";
	private static final String DBPASS = "root";
	private static final String QUERY = "SELECT * FROM Weeknd";
	
public static void main(String[] args) throws Exception {
	
	//Step -1 load the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//Step -2 Register the Driver
	Connection conn  = DriverManager.getConnection(DBURL, DBUSERNAME, DBPASS);
	
	//Step 3 Prepare the Statement
	Statement stmt = conn.createStatement();
	
	//Step 4 EXECUTE THE QUERY
	
	ResultSet rs = stmt.executeQuery(QUERY);
	
	while(rs.next()) {
		System.out.printf("%-5s %-20s %-20s%n",
				rs.getString(1),
				rs.getString(2),
				rs.getString(3));
	}
	
	conn.close();
	
}
}
