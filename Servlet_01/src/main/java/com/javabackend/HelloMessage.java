//servlet 1 
//non-persistent cookie

package com.javabackend;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloMessage extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// for checking if cookies exist or not
		String name = req.getParameter("name");
		PrintWriter out = res.getWriter();
		boolean visted = false;
		Cookie[] cookies = req.getCookies();// getting cookies came along with the request
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie c = cookies[i];
				String cookieName = c.getName();// each cookie will have its own name and value
				String cookieValue = c.getValue();
				if (cookieName.equals("name") && cookieValue.equals(name)) {
					out.print("Cookie exist \ncookie name : " + cookieName + "\nCookie value : " + cookieValue);
					visted = true;
					break;
				}
			}
		}
		if(!visted) {
			out.print("Cookie not exist ");
			//for handling space in the entered value we need to encode the name before  adding to the res.
//			String encodedName = URLEncoder.encode(name, "UTF-8");
//			Cookie c = new Cookie("name", encodedName);
			Cookie c =new Cookie("name",name);//since no cookie exist we need to create and  add new cookie to the response
			res.addCookie(c);//adding cookie to the response
		}

	}
}
