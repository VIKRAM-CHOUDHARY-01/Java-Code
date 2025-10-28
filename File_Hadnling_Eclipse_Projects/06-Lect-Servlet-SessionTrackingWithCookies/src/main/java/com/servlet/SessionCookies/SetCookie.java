package com.servlet.SessionCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookie")
public class SetCookie extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String book1 = req.getParameter("book1");
		String book2 = req.getParameter("book2");
		String book3 = req.getParameter("book3");
		String book4 = req.getParameter("book4");
		
		if(book1!=null) {
			Cookie c1 = new Cookie("book1", book1);
			resp.addCookie(c1);
			
		}else if(book2!=null) {
			Cookie c2 = new Cookie("book2", book2);
			resp.addCookie(c2);
		} else if(book3!=null) {
			Cookie c3 = new Cookie("book3", book3);
			resp.addCookie(c3);
		} else if(book4!=null) {
			Cookie c4 = new Cookie("book4", book4);
			resp.addCookie(c4);
		}
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Book Selection</title>");
		out.println("<style>");
		out.println("body {");
		out.println("    font-family: Arial, sans-serif;");
		out.println("    background-color: #f0f8ff;");
		out.println("    text-align: center;");
		out.println("    padding-top: 100px;");
		out.println("}");
		out.println("h2 {");
		out.println("    color: #2e8b57;");
		out.println("}");
		out.println("a {");
		out.println("    display: inline-block;");
		out.println("    margin-top: 20px;");
		out.println("    padding: 10px 20px;");
		out.println("    background-color: #2e8b57;");
		out.println("    color: white;");
		out.println("    text-decoration: none;");
		out.println("    border-radius: 5px;");
		out.println("    transition: background-color 0.3s ease;");
		out.println("}");
		out.println("a:hover {");
		out.println("    background-color: #246b45;");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2>Successfully Selected Books</h2>");
		out.println("<a href='getCookie'>Next</a>");
		out.println("</body>");
		out.println("</html>");

		
	}

}
