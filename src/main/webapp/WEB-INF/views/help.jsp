<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored = "false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HELP</title>
</head>
<body>

	<%
		/* String name =(String)request.getAttribute("name");
		Integer rollnumber = (Integer) request.getAttribute("roll_number");
		LocalDateTime time =(LocalDateTime) request.getAttribute("time"); */
		
	%>

	<h1>hello there</h1>
	<h1>My name is <%-- <%=name %> --%> ${name}</h1>
	<h1>Roll No: <%-- <%=rollnumber %> --%>${roll_number}</h1>
	<h1>Current Time: <%-- <%=time %> --%>${time}</h1>
	<hr> 
	
	<c:forEach var="item" items="${marks }">
		<h1>${item }</h1>
	</c:forEach>
</body>
</html>