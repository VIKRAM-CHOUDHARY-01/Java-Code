package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Showing_Data {
	public static void main(String[] args) throws Exception {
		//Load the Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Create the Connection
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/star", "root", "root");
		
		//Prepare the statement
		Statement stmt = conn.createStatement();
		
		//Execute the Statement
		
		ResultSet rt = stmt.executeQuery("SELECT * FROM Weeknd");
		System.out.println("ID \t\t SONG NAME \t\t Release Date \t\t");
		
	while(rt.next()) {
			System.out.println(rt.getString("ID") + " \t\t " + rt.getString("song_name") + " \t\t "  + rt.getString("realese_date"));
		}
	
	//close the connection
	conn.close();
		
	}

}
