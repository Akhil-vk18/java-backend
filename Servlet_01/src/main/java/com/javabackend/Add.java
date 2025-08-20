package com.javabackend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		//url rewiting,getting data from url
		int n = Integer.parseInt(req.getParameter("sum"));
		PrintWriter out = res.getWriter();
		out.print("Running Second servlet \n sum value from the parameter :"+n);
		
		
	}
	
}
