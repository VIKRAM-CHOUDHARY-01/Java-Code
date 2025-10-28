package com.crud.main;

import java.util.Scanner;

import com.crud.login.Login;
import com.crud.registration.Registration;

public class JDBC_CRUD_PROJECT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hello User : \n");
		System.out.println("Please Enter 1 to Registar, 2 to Login : ");
		String choice = sc.nextLine();
		if(choice.equals("1")) {
			Registration rg = new Registration();
			rg.registration();
			
		}else if(choice.equals("2")) {
			Login lg = new Login();
			lg.login();
		}
		else {
			System.out.println("Wrong Input!!!, Please  Restart the Program and Enter Correct Option");
		}
	}

}
