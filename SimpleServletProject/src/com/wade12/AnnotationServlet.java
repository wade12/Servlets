package com.wade12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AnnotatinServlet
 */
@WebServlet(description = "My 1st Servlet", urlPatterns = { "/AnnotationServletPath" })
/*, 
			initParams = { @WebInitParam( name = "defaultUser", value = "Paddy Murphy")})
*/
public class AnnotationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// System.out.println("Dia Duit from doGet method.");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		// writer.println("Dia Duit in html.<h3>");
		// response.getWriter().println("Dia Duit in html - in the web browser!<h3>");
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
			if ( (userName != "") && (userName != null) ) {
				session.setAttribute("savedUserName", userName);
				context.setAttribute("savedUserName", userName);
			} // end if
		writer.println("Request parameter has userName: " + userName);
		writer.println("Session parameter has userName: " + (String) session.getAttribute("savedUserName"));
		writer.println("Context parameter has userName: " + (String) context.getAttribute("savedUserName"));

	} // end method doGet

} // end Class AnnotationServlet
