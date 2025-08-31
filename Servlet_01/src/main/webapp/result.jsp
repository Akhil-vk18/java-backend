<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="purple" text ="white">
	<%
	int number = Integer.parseInt(request.getParameter("number"));
	int square = number * number;
	out.print("square of " + number + " = " + square);
	%>
</body>
</html>