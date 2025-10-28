package com.crud.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.crud.connections.ConnectionDetails;
import com.crud.registration.Registration;

public class DeleteData {

	public boolean delete(String id) {

		try (

				Connection conn = DriverManager.getConnection(ConnectionDetails.url + ConnectionDetails.dbName,
						ConnectionDetails.userName, ConnectionDetails.userPassword);

				PreparedStatement stmt = conn
						.prepareStatement("DELETE FROM " + ConnectionDetails.tbName + " WHERE id = ?");
				Scanner sc = new Scanner(System.in);)
		{

			stmt.setString(1, id);
			int result = stmt.executeUpdate();
		

			if (result > 0) {
				
				System.out.println("Your Profile Deleted Successfully");
				System.out.println("Enter 1 to register or any key to close : ");
				String a = sc.nextLine();
				if (a.equals("1")) {
					Registration rg = new Registration();
					rg.registration();
					return true;
				} else {
					System.out.println("Program Closed.");
					return true;
				}

			} else {

				System.out.println("Your Profile is not deleted please try again later.");

			}

		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}

		System.out.println("Program Closed");

		return true;
	}

}
