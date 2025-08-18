package com.javabackend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Add extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int sum =(int)req.getAttribute("sum");//getting value from the first servlet using the key which we used for setting value
		PrintWriter out = res.getWriter();
		out.print("Running Second servlet \n");
		out.print("sum is "+sum);
		
	}
	
}
