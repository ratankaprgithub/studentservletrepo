<%@page import="com.cts.beans.CourseBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">

<h1>Course Details Are:-</h1>

<% 

 Object obj= request.getAttribute("cdata"); 

	if(obj != null){
		
		CourseBean c=(CourseBean)obj;

%>

<h2>Course Name is :<%=c.getCourseName() %></h2>
<h2>Course Fee is :<%=c.getCourseFee() %></h2>
<h2>Course Duration is :<%=c.getCourseDuration() %></h2>
<h2>Course StartDate is :<%=c.getCourseDate() %></h2>





<%}else{ %>

<h2>Course Not Found....</h2>


<%} %>


</body>
</html>