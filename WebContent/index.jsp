<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

<h1 align="center">Welcome to Student Project</h1>

<form action="LoginSrv" method="post">


Enter UserName :<input type="text" name="uname"><br><br>
Enter Password :<input type="password" name="pass"><br><br>

LoginAs :

<select name="loginAs">

<option>Admin</option>
<option>Clerk</option>
<option>Student</option>
</select>



<input type="submit" value="Login">

</form>


<a href="studentRegister.jsp">New Student ? SignUp!</a>



</body>
</html>