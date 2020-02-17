<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">

<h1>Add New Course Screen</h1>

<form action="AddCourseSrv" method="post">

Enter Course Name :<input type="text" name="courseName"><br><br>
Enter Duration :<input type="text" name="courseDuration"><br><br>
Enter Fee :<input type="text" name="courseFee"><br><br>
Enter Start-Date :<input type="date" name="courseDate"><br><br>

<input type="submit" value="AddCourse">


</form>



</body>
</html>