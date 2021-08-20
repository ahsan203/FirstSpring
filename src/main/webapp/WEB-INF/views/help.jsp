<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page isELIgnored="false" %>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>
<h1>This is help page:  </h1>

<%

String name=(String)request.getAttribute("name");
LocalDateTime dateAndTime=(LocalDateTime)request.getAttribute("dtAndTm");

%>
<h1>My name is :  <%=name %></h1>
<h1>Today's Date & Time is : <%=dateAndTime %></h1>
<h2> MY Roll Number is : ${rollNumber}</h2>


<c:forEach var="ml" items="${marksList}">
<h1>My marks list is : ${ml}</h1>
</c:forEach>


</body>
</html> 