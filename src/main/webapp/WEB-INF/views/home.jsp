<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome</h1>
<br>
<c:if test="${!empty msg}">
${msg}
</c:if>
<h2>If already registed <a href="/WbApp-1.0-SNAPSHOT/login">Click Here</a></h2><br><br><br>
<h2>TO Register <a href="/WbApp-1.0-SNAPSHOT/register">Click Here</a></h2>
</body>
</html>