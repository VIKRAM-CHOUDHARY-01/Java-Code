package com.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginFilter implements Filter {
	Connection conn;
	
	@Override
	public void init(FilterConfig filterConfig) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdb","root", "root");
			
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String s1 = request.getParameter("username");
		String s2 = request.getParameter("password");
		
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("SELECT * FROM loginTable WHERE userName=? AND userPassword=?");
			pst.setString(1, s1);
			pst.setString(2, s2);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				chain.doFilter(request, response);
			}else {
				PrintWriter pw = response.getWriter();
				pw.println("<html><body bgcolor=yellow text=red><h1>");
						pw.println("Invalid Username/Password"); 
						   pw.println("</h1></body></html>"); 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		;
		
	}

}
