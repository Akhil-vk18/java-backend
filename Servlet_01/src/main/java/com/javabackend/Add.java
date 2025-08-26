//second servlet 
//recieves values from the session
package com.javabackend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class Add extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//create an object of session for getting values stored in the session from another one
		HttpSession session = req.getSession();
		//get values by key
		int number =(int) session.getAttribute("key");
		int square = number*number ;
		PrintWriter out =res.getWriter();
		out.print("Square of "+number +" = "+square);
	}
	
}
