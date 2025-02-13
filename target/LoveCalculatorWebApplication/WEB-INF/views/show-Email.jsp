<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send Email</title>
</head>
<body>
	<%-- <p>Hii ${LCUserName}</p>   Cookie--%>
	<%-- <p>Hii ${SesionUserName}</p> session--%>
	<p>Hii ${Login.userName}</p> <%--@Session Attribute --%>
	<h2>Send Result to your Email</h2>
	<form:form action="processEmail" method="get"  modelAttribute="EmailDTO">
		<label for="email">Your Email-Id:</label>
		<form:input path="userEmail" id="email"/>
		<br><br>
		<input type="submit" value="Send Email">
		
	</form:form>
</body>
</html>