<%@page import="com.cts.beans.CourseBean"%>
<%@page import="java.util.List"%>
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

	Object obj=request.getAttribute("coursesdata");
	List<CourseBean> courses=(List<CourseBean>)obj;
	
%>

<table cellspacing="10" cellpadding="20" bgcolor="yellow" align="center">

	<tr>
		<th>Course Name</th>
		<th>Course Durartion</th>
		<th>Course Fee</th>
		<th>Course StartDate</th>
	</tr>

<%
for(CourseBean c:courses){
%>

	<tr>
		<td><%=c.getCourseName() %></td>
		<td><%=c.getCourseDuration() %></td>
		<td><%=c.getCourseFee() %></td>
		<td><%=c.getCourseDate() %></td>
	</tr>


<%} %>



</table>
















</body>
</html>