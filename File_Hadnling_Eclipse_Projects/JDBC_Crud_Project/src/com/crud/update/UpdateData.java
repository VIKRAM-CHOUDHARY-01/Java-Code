package com.crud.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.crud.connections.ConnectionDetails;
import com.crud.datacheck.DataCheck;
import com.crud.login.Login;

public class UpdateData {

	public void update(String id) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----------  Update Page  ------------------\n");
		System.out.println(
				"Either Enter Updated Details or preess enter to skip any perticular data that you don't want to change : \n");
		
		String email = "";
		String password = "";
		String address = "";
		String name = "";

		System.out.println("Update Full Name : ");
		name = sc.nextLine();

		System.out.println("Update Email  : ");
		email = sc.nextLine();

		System.out.println("Update Password (It should be atleast 5 character long): ");
		password = sc.nextLine();

		System.out.println("Update Address  : ");
		address = sc.nextLine();


		try(
				Connection conn = DriverManager.getConnection(ConnectionDetails.url + ConnectionDetails.dbName,
						ConnectionDetails.userName, ConnectionDetails.userPassword);

				Statement stmt = conn.createStatement();
				) {
			

		
			if (name != "") {
				int s = stmt.executeUpdate("UPDATE " + ConnectionDetails.tbName + " SET name = '" + name + "'"
						+ " WHERE id = '" + id + "'");
				System.out.println("name is updated");
			}
			if (email != "") {
				DataCheck dc = new DataCheck();
				if (dc.emailCheck(email)) {
					int s = stmt.executeUpdate("UPDATE " + ConnectionDetails.tbName + " SET email = '" + email + "'"
							+ " WHERE id = '" + id + "'");
					System.out.println("email is updated");
				}

			} 
			if (password != "" && password.length() >= 5) {
				int s = stmt.executeUpdate("UPDATE " + ConnectionDetails.tbName + " SET password = '" + password + "'"
						+ " WHERE id = '" + id + "'");
				System.out.println("password is updated");
			} 
			if (address != "") {
				int s = stmt.executeUpdate("UPDATE " + ConnectionDetails.tbName + " SET address = '" + address + "'"
						+ " WHERE id = '" + id + "'");
				System.out.println("address is updated");
			}
			
			if (address == "" && password == "" && email == "" && name == ""){
				System.out.println("Atleast update one data, please try again");
				update(id);
			}

			System.out.println("\n All things Updated as Requested now please Login Again to see Updated Data : \n");
			Login lg = new Login();
			lg.login();
			

		} catch (Exception e) {
			
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
