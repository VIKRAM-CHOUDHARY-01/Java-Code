package com.regiesteration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out =response.getWriter();
		
		String name = request.getParameter("fullname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String phoneNumber = request.getParameter("phone");
		String country = request.getParameter("country");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdb","root", "root");
			PreparedStatement pstm = conn.prepareStatement("INSERT INTO registrationdata (fullname, email, password, phone, country) VALUES (?, ?, ?, ?, ?)");
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, password);
			pstm.setString(4, phoneNumber);
			pstm.setString(5, country);
			
			int i = pstm.executeUpdate();
			if (i > 0) {
			    response.setContentType("text/html");
			    out.println("<html>");
			    out.println("<head>");
			    out.println("<title>Registration Success</title>");
			    out.println("<style>");
			    out.println("body { font-family: Georgia, serif; background-color: #f4f4f4; padding: 20px; }");
			    out.println("h2 { color: green; }");
			    out.println("table { width: 80%; border-collapse: collapse; margin: 20px 0; background-color: #fff; }");
			    out.println("th, td { padding: 12px; border: 1px solid #ccc; text-align: left; }");
			    out.println("th { background-color: #f2f2f2; color: #333; }");
			    out.println("tr:nth-child(even) { background-color: #f9f9f9; }");
			    out.println("</style>");
			    out.println("</head>");
			    out.println("<body>");

			    out.println("<h2>You are registered successfully!</h2>");
			    out.println("<h3>Here is your data:</h3>");

			    Statement st = conn.createStatement();
			    ResultSet rst = st.executeQuery("SELECT * FROM registrationdata");

			    out.println("<table>");
			    out.println("<tr>");
			    out.println("<th>Full Name</th>");
			    out.println("<th>Email</th>");
			    out.println("<th>Password</th>");
			    out.println("<th>Phone Number</th>");
			    out.println("<th>Country</th>");
			    out.println("</tr>");

			    while (rst.next()) {
			        out.println("<tr>");
			        out.println("<td>" + rst.getString("fullname") + "</td>");
			        out.println("<td>" + rst.getString("email") + "</td>");
			        out.println("<td>" + rst.getString("password") + "</td>");
			        out.println("<td>" + rst.getString("phone") + "</td>");
			        out.println("<td>" + rst.getString("country") + "</td>");
			        out.println("</tr>");
			    }

			    out.println("</table>");
			    out.println("</body></html>");
			}
		

			
						
				
				
			else {
				out.print("You are not Registered, there is an error");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
