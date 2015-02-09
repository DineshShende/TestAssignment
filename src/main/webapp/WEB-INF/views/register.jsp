<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Registration Form</h1>

<form action="/WbApp-1.0-SNAPSHOT/registration" method="post">
<table cellpadding="10" border="2">
<tr>
<th>Username</th>
<td><input type="text" name="username"/></td>
</tr>
<tr>
<th>Password</th>
<td><input type="password" name="password"/></td>
</tr>
<tr>
<th>Address</th>
<td><input type="text" name="street"/></td>
<td><input type="text" name="city"/></td>
<td><input type="text" name="state"/></td>
<td><input type="text" name="zip"/></td>
</tr>
<tr>
<th>E-mail</th>
<td><input type="text" name="email"/></td>
</tr>
<tr>
<th>Mobile</th>
<td><input type="text" name="mobile"/></td>
</tr>
<tr>
</table>
<br>
<br>
<p align="center"><input type="submit" value="submit"/></p>
</form>

</body>
</html>