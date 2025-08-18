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
		//calling another servlet from a servlet
		PrintWriter out= res.getWriter();
		out.print("Running first servlet ");
		req.setAttribute("sum", sum);//for forwading the value to the 2nd servlet,we need to set the req with key and value
		RequestDispatcher rd = req.getRequestDispatcher("add");//forwading to 2nd servlet
		rd.forward(req, res);
	}
}
