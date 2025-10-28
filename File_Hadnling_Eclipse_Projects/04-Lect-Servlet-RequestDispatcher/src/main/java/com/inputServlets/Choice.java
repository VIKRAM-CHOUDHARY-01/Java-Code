package com.inputServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Choice
 */
@WebServlet("/Choice")
public class Choice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Choice() {
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
		
		String s1 = request.getParameter("operation");
		
		PrintWriter out = response.getWriter();
		
		
		if(s1.equals("add")) {
			RequestDispatcher rd = request.getRequestDispatcher("add");
			rd.forward(request, response);
		} else if(s1.equals("sub")) {
			RequestDispatcher rd = request.getRequestDispatcher("sub");
			rd.forward(request, response);
		}else {
			out.print("Click Valid Button");
		}
		out.close();
	}

}
