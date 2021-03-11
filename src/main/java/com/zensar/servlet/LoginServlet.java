package com.zensar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("password");
		if(uname.equals("Zensar")&& pass.equals("zensar")) {
			response.setContentType("text/html");
			System.out.println("Ram");
			response.getWriter().print("<h2> Authentication Successful!!</h2>");
			
		}
		else {
			response.setContentType("text/html");
			response.getWriter().print("<h2> Authentication Failed!!</h2>");
		}
			
	}

}
