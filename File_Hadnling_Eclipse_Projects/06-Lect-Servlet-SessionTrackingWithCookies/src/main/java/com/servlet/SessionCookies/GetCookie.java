package com.servlet.SessionCookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getCookie")
public class GetCookie extends HttpServlet {

@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();

	Cookie[] cookies = req.getCookies();

	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<meta charset='UTF-8'>");
	out.println("<title>Cookies Viewer</title>");
	out.println("<style>");
	out.println("body {");
	out.println("    font-family: Arial, sans-serif;");
	out.println("    background-color: #f4f4f4;");
	out.println("    padding: 40px;");
	out.println("    color: #333;");
	out.println("}");
	out.println("h2 {");
	out.println("    color: #4CAF50;");
	out.println("}");
	out.println("table {");
	out.println("    width: 60%;");
	out.println("    margin: 20px auto;");
	out.println("    border-collapse: collapse;");
	out.println("}");
	out.println("th, td {");
	out.println("    border: 1px solid #ccc;");
	out.println("    padding: 10px;");
	out.println("    text-align: left;");
	out.println("}");
	out.println("th {");
	out.println("    background-color: #f2f2f2;");
	out.println("}");
	out.println("</style>");
	out.println("</head>");
	out.println("<body>");

	out.println("<h2>Received Cookies</h2>");

	if (cookies != null && cookies.length > 0) {
	    out.println("<table>");
	    out.println("<tr><th>Name</th><th>Value</th></tr>");
	    for (Cookie cookie : cookies) {
	        out.println("<tr>");
	        out.println("<td>" + cookie.getName() + "</td>");
	        out.println("<td>" + cookie.getValue() + "</td>");
	        out.println("</tr>");
	    }
	    out.println("</table>");
	} else {
	    out.println("<p>No cookies found.</p>");
	}

	out.println("</body>");
	out.println("</html>");

}
}
