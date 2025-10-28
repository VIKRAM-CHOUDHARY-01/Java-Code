package com.servlet.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
		  pw.println("<html><body bgcolor=red text=yellow><h1>"); 
		  pw.println("Welcome...................."); 
		 pw.print(req.getParameter("username"));
		  pw.println("</h1></body></html>"); 
	}
	
}
