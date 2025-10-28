package COM.PROJECT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main_Project_Class {
	private static String DBURL = "jdbc:mysql://localhost:3306/USER_DATABASE";
	private static String DBUSER = "root";
	private static String DBPASS = "root";
	private static String TBNAME = "Users";
	private static String INSERTQUERY = "INSERT INTO " + TBNAME + " (name, age, city, email, password) VALUES (?, ?, ?, ?, ?)";
	private static String DATAFATCHQUERY = "SELECT * FROM " + TBNAME + " WHERE password = ? AND email = ?";

	public static void Registration(String name, int age, String city, String Email, String Password) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
//		Statement stmt = conn.createStatement();
		
		PreparedStatement pstmt = conn.prepareStatement(INSERTQUERY);

		if (!EmailCheck(Email)) {
//			int rowsAffected = stmt.executeUpdate("INSERT INTO " + TBNAME + "(name, age, city, email, password)"
//					+ " VALUES ('" + name + "', " + age + ", '" + city + "', '" + Email + "', '" + Password + "')");
//			System.out.println(rowsAffected + " Rows Affected");
			
		    pstmt.setString(1, name);
		    pstmt.setInt(2, age);
		    pstmt.setString(3, city);
		    pstmt.setString(4, Email);
		    pstmt.setString(5, Password);
			
			int rowAffacted = pstmt.executeUpdate();
			System.out.println("You have Succesfully Registered Now");

		} else {
			System.out.println("Entered Email Already Used in Registration");
		}
		conn.close();
	}

	public static void Login(String Email, String Pasword) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
//		Statement stmt = conn.createStatement();
		PreparedStatement pstmt = conn.prepareStatement(DATAFATCHQUERY);

		if (EmailCheck(Email)) {
			if (PasswordCheck(Pasword)) {
				System.out.println("You Are Sucessfully Logged In : ");
				System.out.println("Your Full Details Are : ");
				pstmt.setString(1, Pasword);
				pstmt.setString(2, Email);
				ResultSet rst = pstmt.executeQuery();
				while (rst.next()) {
					System.out.println("Your Name : " + rst.getString(2) + "\n Your Age : " + rst.getString(3)
							+ "\n Your City : " + rst.getString(4) + "\n Your Email : " + rst.getString(5)
							+ "\n Your Password (Which you should not share with Anyone, Please.) : "
							+ rst.getString(6));

				}

			} else {
				System.out.println("You have Entered Wrong Password");
			}

		} else {
			System.out.println("Entered Email is not Registered Yet");
		}
		conn.close();

	}

	public static boolean PasswordCheck(String password) throws Exception {
		boolean flag = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		Statement stmt = conn.createStatement();
		ResultSet rst = stmt.executeQuery("SELECT password FROM " + TBNAME);
		while (rst.next()) {
			if (password.equals(rst.getString(1))) {
				flag = true;
			}
		}
		conn.close();

		return flag;
	}

	public static boolean EmailCheck(String email) throws Exception {
		boolean flag = false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		Statement stmt = conn.createStatement();
		ResultSet rst = stmt.executeQuery("SELECT email FROM " + TBNAME);
		while (rst.next()) {

			if (email.equals(rst.getString(1))) {
				System.out.println(rst.getString(1));
				System.out.println(email);
				flag = true;
			}
		}
		conn.close();

		return flag;
	}

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String Email;
		String Password;
		System.out.println("Enter 1 To login, 2 for Registration :");
		int option = sc.nextInt();
		sc.nextLine();
		if (option == 1) {

			System.out.println("Enter Your Email : ");
			Email = sc.nextLine();

			System.out.println("Enter Your Password : ");
			Password = sc.nextLine();

			Login(Email, Password);

		} else if (option == 2) {
			System.out.println("Enter Full Name :");
			String name = sc.nextLine();

			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Your City : ");
			String city = sc.nextLine();

			System.out.println("Enter Your Email : ");
			Email = sc.nextLine();

			System.out.println("Enter Password: ");
			Password = sc.nextLine();

			boolean flag = false;

			for (int i = 0; i < Email.length() - 2; i++) {
				if (Email.charAt(i) == '@') {

					Registration(name, age, city, Email.toLowerCase(), Password);
					flag = true;
					break;

				}
			}
			if (!flag) {
				System.out.println("Please Enter a Valid Email.");
			}

		} else {
			System.out.println("Wrong Option : Please Select Right Option");
		}

	}
}
