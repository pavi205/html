<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
<body>
<h2>LOGIN PAGE!</h2>
<form:form action="isValidUser" method="post">
Enter User name:<input type="text" name="name">
<br />
Enter password:<input type="password" name="password">
<br />
<input type="submit">


</form:form>


</body>
</html>