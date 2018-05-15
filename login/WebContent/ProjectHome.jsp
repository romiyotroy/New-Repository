<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{background-image:url("https://images.pexels.com/photos/82256/pexels-photo-82256.jpeg?cs=srgb&dl=background-pine-texture-82256.jpg&fm=jpg")};
h1{color:red}
</style>
</head>
<body>
<%
String username = request.getParameter("userName");
String password = request.getParameter("passWord");
if(username.equals("r")&&password.equals("p"))
{
%>
	<p style="text-align:right;">
		<%="welcome "+ username%><t>
		<b>Log off</b>
	</p>
	<img src="C:/Users/Romiyo/Desktop/java_logo.png" width="100">
	<h1>Home</h1>
	
	<%! int cube(int n){
		return n*n*n;
	} %>
	<%="cube of 3 is "+ cube(3) %>
	
<%} else out.print("invalid username or password. Please try again"); %>


</body>
</html>