<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>Login</h1>
	<form name='loginForm' action="<c:url value='j_spring_security_check' />" method='POST'>
	  <table>
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit" value="submit" /></td>
			</tr>
	  </table>
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>

		<c:if test="${not empty error }">
			<div>${error}</div>
		</c:if>
		<c:if test="${not empty logout }">
			<div>${logout}</div>
		</c:if>	
		
	</center>
</body>
</html>