package com.crud.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.crud.connections.ConnectionDetails;
import com.crud.datacheck.DataCheck;
import com.crud.login.Login;

public class Registration {

	public void registration() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Full Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Email : ");
		String email = sc.nextLine();
		System.out.println("Enter Password (It should be atleast 5 character long) : ");
		String password = sc.nextLine();
		System.out.println("Enter Address : ");
		String address = sc.nextLine();

		DataCheck dc = new DataCheck();
		if (dc.emailCheck(email) && password.length() >= 5) {

			try (
					// Step -2 Load the driver

					Connection conn = DriverManager.getConnection(ConnectionDetails.url + ConnectionDetails.dbName,
							ConnectionDetails.userName, ConnectionDetails.userPassword);

					// Prepare the statement

					PreparedStatement stmt = conn
							.prepareStatement("INSERT INTO " + ConnectionDetails.tbName + " VALUES (?,?,?,?,?)");) {

				stmt.setString(1, null);
				stmt.setString(2, name);
				stmt.setString(3, email);
				stmt.setString(4, password);
				stmt.setString(5, address);
				// Execute the Query

				int result = stmt.executeUpdate();
				if (result > 0) {
					System.out.println(
							"You are Registered Succesfully, Click 1 to login or press any key to close program.");
					String a = sc.next();
					// close the connection
					conn.close();
					if (a.equals("1")) {
						Login lg = new Login();
						lg.login();

					} else {
						System.out.println("Program Ended, To use Please Restart the program.");

					}
				} else {
					System.out.println("Registration Failed, please try again.");

				}

				// close the connection
				conn.close();
				return;

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			registration();
		}
	}
}
