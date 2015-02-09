<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Successfully log in
<br>
<br>
<table cellpadding="10" border="2" align="center">
<tr>
<th>User Name</th>
<td>${user.getName()}</td>
</tr>
<tr>
<th>User E-Mail</th>
<td>${user.getEmail()}</td>
</tr>
<tr>
<th>User Mobile</th>
<td>${user.getMobile()}</td>
</tr>
<tr>
<th>Address</th>
</tr>
<tr>
<td><b>Street</td>
<td><b>City</td>
<td><b>State</td>
<td><b>Zip Code</td>
</tr>
<tr>
<td>${user.getAddress().getStreet()}</td>
<td>${user.getAddress().getCity()}</td>
<td>${user.getAddress().getState()}</td>
<td>${user.getAddress().getZipcode()}</td>

</tr>

</table>
</body>
</html>