package com.crud.datacheck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.crud.connections.ConnectionDetails;
import com.crud.registration.Registration;

public class DataCheck {
	
	public DataCheck(){
		
	}
	
	public boolean emailCheck(String email) {
		if((email.contains("@")) && (email.contains(".")) && (!email.endsWith("@")) && (!email.endsWith("."))) {
			// Step -1 Register the driver
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				// Step -2 Load the driver

				Connection conn = DriverManager.getConnection(ConnectionDetails.url + ConnectionDetails.dbName,
						ConnectionDetails.userName, ConnectionDetails.userPassword);
				
				PreparedStatement stmt = conn.prepareStatement("SELECT id FROM " + ConnectionDetails.tbName  + " WHERE email = ?");
				
				stmt.setString(1, email);
				
				ResultSet s = stmt.executeQuery();
		
				
		
				if(s.next()) {
					System.out.println("Email Already Exists, Please register with new email.");
					s.close();
					conn.close();
					return false;
				}else {
					s.close();
					conn.close();
					return true;
					
				}
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			} 
		} else {
			System.out.println("Email is invalid, Please enter Valid Email");
			return false;
		}
		return false;
	}
	
	public boolean loginDataCheck(String email, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Step -2 Load the driver

			Connection conn = DriverManager.getConnection(ConnectionDetails.url + ConnectionDetails.dbName,
					ConnectionDetails.userName, ConnectionDetails.userPassword);
			
			PreparedStatement stmt = conn.prepareStatement("SELECT id FROM " + ConnectionDetails.tbName +  " WHERE password = ? AND email = ?");
			
			stmt.setString(1, pass);
			stmt.setString(2, email);
			ResultSet s = stmt.executeQuery();
			
	
			if(s.next()) {
				s.close();
				conn.close();
				return true;
			}
			s.close();
			conn.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		
		return false;
	}

}
