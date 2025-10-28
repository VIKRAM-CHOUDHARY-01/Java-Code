package com.inputServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sub")
public class SubstractionServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");

		
		
		try {
			int v1  = Integer.parseInt(req.getParameter("num1"));
			int v2 = Integer.parseInt(req.getParameter("num2"));
			
			int result = v1-v2;
			out.print("The Subsrtaction Result is : " + result);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please Enter valid Number");
		}
		
	}
}
