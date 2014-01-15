package com.wade12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "My 1st Servlet", urlPatterns = { "/AnnotationServletPath" })
public class AnnotationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dia Duit from doGet method.");
		// PrintWriter writer = response.getWriter();
		// writer.println("Dia Duit in html.<h3>");
		response.getWriter().println("Dia Duit in html - in the web browser!<h3>");
	} // end method doGet

} // end Class AnnotationServlet
