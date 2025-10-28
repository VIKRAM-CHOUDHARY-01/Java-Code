package com.jdbc_basics;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatement_Usage {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_database", "root", "root");
	CallableStatement cs = conn.prepareCall("{CALL getUserById(?)}");
	cs.setInt(1, 3);
	ResultSet rs = cs.executeQuery();
	
	while(rs.next()) {
		System.out.println(rs.getString(1) + "\t " + rs.getString(2) + "\t " + rs.getString(3) + "\t " + rs.getString(4) + "\t " + rs.getString(5) + "\t " + rs.getString(6));
	}
	conn.close();
	
	
	
}
}
