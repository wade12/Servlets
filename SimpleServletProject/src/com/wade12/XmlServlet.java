package com.wade12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("xml servlet called.");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Dia Duit " + userName + " from doGet method");
	} // end method doGet
	
	// post parameter requires html form
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		String userName = request.getParameter("userName");
		String surname = request.getParameter("surname");
		output.println("Dia Duit " + userName + " from doPost method");
		output.println("Your surname is: " + surname);
		String profession = request.getParameter("profession");
		output.println("Your profession is: " + profession);
		// String offices = request.getParameter("location");
		String[] offices = request.getParameterValues("location");
		output.println("Your company has offices in: " + offices.length + " cities");
		
		for (int i=0; i<offices.length; i++) {
			output.println(offices[i]);
		} // end for loop
	} // end method doPost
	
} // end Class XmlServlet
