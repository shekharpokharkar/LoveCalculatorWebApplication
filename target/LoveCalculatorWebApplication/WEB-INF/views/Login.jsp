<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
	text-align: left;
	margin-left: 30px;
	position: fixed;
}
</style>

<script type="text/javascript">
	function validateUserName() {
		var UN = document.getElementById("name").value;
		if ((UN.length) <= 1) {

			alert("Your Name should be greater than 1 character");
			return false;

		} else {
			return true;
		}
	}
</script>
</head>
<body>
	<h2 align="center">Love Calculator</h2>
	<hr>
	<form:form action="processLogin" method="get" modelAttribute="Login">
		<div align="center">
		
			<label for="name">UserName</label>
			<form:input path="userName" id="name" />
			<form:errors path="userName" cssClass="error" />
			<br> 
			<br> 
			<label for="CN">CrushName</label>
			<form:input path="crushName" id="CN" />
			<form:errors path="crushName" cssClass="error" />
			<br> 
			<br>
			<form:checkbox path="termsAndConditions" />
			<label>I am Agreeing it's just for fun</label>
			<form:errors path="termsAndConditions" cssClass="error" />
			<br>
			<br> <input type="submit" value="Calculate">
		</div>
	</form:form>
</body>
</html>