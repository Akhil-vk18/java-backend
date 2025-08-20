//servlet 1 
package com.javabackend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloMessage extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt( req.getParameter("num1"));
		int num2= Integer.parseInt(req.getParameter("num2"));
		int sum = num1+num2;
		res.sendRedirect("add?sum="+sum);
	}
}
