package com.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubmitServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1. Collect the input type data
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		
		//2. Process the Request and Prepare response
		String msg = "<h1>Hello " + name + " </h2><h2> Your Password is : " + pass + "</h2>";
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.print(msg);
		
	}
}
