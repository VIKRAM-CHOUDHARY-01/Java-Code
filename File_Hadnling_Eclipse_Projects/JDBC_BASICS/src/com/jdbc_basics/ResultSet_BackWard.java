package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSet_BackWard {
public static void main(String[] args) throws Exception {
	// Load the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	//set the connection
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database", "root", "root");
	
	//Prepare Statement
	
	Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	
	
	// sql query
	
	ResultSet rs = stmt.executeQuery("SELECT * FROM users");
	
	if (rs.last()) {  // Move to last row; check if ResultSet is not empty
	    do {
	        System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6));
	    } while (rs.previous());  // Move backwards until no rows left
	}
	
}
}