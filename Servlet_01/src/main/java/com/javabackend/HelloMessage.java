//servlet 1 
//passing values to another servlet using session 

package com.javabackend;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
// @webServlet("path") can be used for declaring a servlet . easier than writing in xml file.
@WebServlet("/message")
public class HelloMessage extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int  number = Integer.parseInt( req.getParameter("number"));
		HttpSession session = req.getSession();
		session.setAttribute("key", number);
//		System.out.print(session.getAttribute("key"));
		res.sendRedirect("add");//redirect to the second servlet
	}
}
