package COM.PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DATABASE_CREATION {
	//this is the first file, you need to execute when you run this project this project for the first time
	// this class sets up database and table for our Project
	public static void main(String[] args) throws Exception {
		// Step :1 Load the Driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//Step 2 : Set the Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		
		//Step 3 : Set the Query
		
		String DATABASE = "UserDatabase";
		
		Statement stmt = conn.createStatement();
		
		
		//Step 4 : 
		
		int rowAffected = stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS USER_DATABASE");
		if(rowAffected == 1) {
			System.out.println("Database Created Successfully");
			conn.close();
			Connection conn1 =  DriverManager.getConnection("jdbc:mysql://localhost:3306/USER_DATABASE","root","root");
			Statement st = conn1.createStatement();
			int rowAffected1 = st.executeUpdate("CREATE TABLE IF NOT EXISTS Users(ID INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(150), age INT, city VARCHAR(50), Email VARCHAR(50), Password VARCHAR(50))");
			System.out.println("Table USER created or Already Exists");
			conn1.close();
			
			
		}else {
			System.out.println("Database Already Exists");
			conn.close();
		}
		
		
		
	}

}
