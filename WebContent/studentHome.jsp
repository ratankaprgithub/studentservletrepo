<%@page import="com.cts.beans.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Object obj=session.getAttribute("studentdata");
	
		if(obj != null){
			
			StudentBean student=(StudentBean)obj;

%>

<h1>Welcome <%=student.getName() %></h1>







<%}else{ %>

<h2>Session Fails...</h2>

<%} %>

</body>
</html>