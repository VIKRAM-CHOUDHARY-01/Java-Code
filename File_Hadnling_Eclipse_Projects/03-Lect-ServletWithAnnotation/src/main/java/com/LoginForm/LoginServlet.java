package com.LoginForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name="loginPage", urlPatterns = "/loggedIn")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// get the data
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		
		//process the data and prepare response
		
		String msg = "";
		if(name.equals(pass)) {
			msg = msg + "<h2> Hello " + name + "</h2>";
			msg = msg + "Login Successful <h3> Welcome to the class </h3>";
			
		}else {
			msg = msg + "<h3> Login Failed";
		}
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print(msg);
	}

}
