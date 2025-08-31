<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--controller for directing the request --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
		String course = request.getParameter("course");
    		//if course is java , send to java.jsp.else javascript.jsp
    		response.sendRedirect(course);
%>
</body>
</html>