package com.crud.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.crud.connections.ConnectionDetails;
import com.crud.datacheck.DataCheck;
import com.crud.delete.DeleteData;
import com.crud.registration.Registration;
import com.crud.update.UpdateData;

public class Login {
	
public void login(){
	Scanner sc = new Scanner(System.in);
	System.out.println("\n---------------------  Login Page  --------------------------\n");
	System.out.println("Enter Email : ");
	String email = sc.nextLine();
	System.out.println("Enter Password : ");
	String password = sc.nextLine();
	System.out.println("\n-------------------\n");
	DataCheck dc = new DataCheck();
	if(dc.loginDataCheck(email, password)) {
		
		try(
				Connection conn = DriverManager.getConnection(ConnectionDetails.url + ConnectionDetails.dbName,
						ConnectionDetails.userName, ConnectionDetails.userPassword);
				
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM " + ConnectionDetails.tbName + " WHERE password = ? AND email = ?");) {
			
			stmt.setString(1, password);
			stmt.setString(2, email);
			ResultSet s = stmt.executeQuery();
			String id = "";
			while(s.next()) {
				id=s.getString("id");
				System.out.println("Hello " + s.getString("name") + " Your Details are followed: ");
				System.out.println("Serial Number : " + s.getString("id"));
				System.out.println("Name : " + s.getString("name"));
				System.out.println("Email : " + s.getString("email"));
				System.out.println("Password : " + s.getString("password"));
				System.out.println("Address : " + s.getString("address"));
			}
			
			System.out.println("\n------------------------------\n");
			System.out.println("Enter 1 to delete your account or 2 to update your info or any to close the program : ");
			String option = sc.nextLine();
			if(option.equals("1")) {
				
				DeleteData dd = new DeleteData();
				dd.delete(id);
				
			}else if(option.equals("2")) {
				UpdateData ud = new UpdateData();
				ud.update(id);
				
			}else {
				System.out.println("Thanks you using this Program");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}else {
		System.out.println("Login info not found, Please try with registered crediantials or enter 1 to register or 2 to try again");
		String a = sc.nextLine();
		if(a.equals("1")) {
			Registration rg = new Registration();
			rg.registration();
		}else if(a.equals("2")){
			login();
		}else {
			System.out.println("Invalid Entry, Program is Closed");
		}
		
		
		
		
	}
}
}
