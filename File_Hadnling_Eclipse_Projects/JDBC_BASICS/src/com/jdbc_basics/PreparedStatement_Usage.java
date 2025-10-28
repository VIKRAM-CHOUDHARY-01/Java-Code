package com.jdbc_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement_Usage {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database", "root", "root");
		String sql = "INSERT INTO users (name, age, city, email, password) VALUES(?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "R Madhvan");
		pstmt.setInt(2, 26);
		pstmt.setString(3, "Jaipur");
		pstmt.setString(4, "hello@gmail.com");
		pstmt.setString(5, "Rashmi");
		
		int RowAffacted = pstmt.executeUpdate();
		System.out.println(RowAffacted);
		conn.close();
		
	}		

}
