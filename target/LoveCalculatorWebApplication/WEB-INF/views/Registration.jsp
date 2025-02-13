<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
</head>
<body>

	<h2 align="center">Love Calculator Registration Page</h2>
	<hr>
	<form:form action="processRegistration" method="get"
		modelAttribute="Registration">
		<div align="center">
			<label for="name">Name</label>
			<form:input path="name" id="name" />
			<br> <br> <label for="UN">UserName</label>
			<form:input path="userName" id="UN" />
			<form:errors path="userName" cssClass="error" />
			<br> <br> <label for="Pass">Password</label>
			<form:password path="password" id="Pass" />
			<br> <br> <label for="country">Country</label>
			<form:select id="country" path="country">
				<form:option value="India">India</form:option>
				<form:option value="china">China</form:option>
				<form:option value="USA">USA</form:option>
				<form:option value="France">France</form:option>
				<form:option value="South Africa">South Africa</form:option>
			</form:select>
			<br> <br> <label>Hobbies:</label>

			<form:checkbox id="banana" path="hobbies" value="Cricket" />
			<label for="banana">Cricket</label>
			<form:checkbox id="orange" path="hobbies" value="Reading" />
			<label for="orange">Reading</label>
			<form:checkbox id="grapes" path="hobbies" value="Swimming" />
			<label for="grapes">Swimming</label> <br> <br> <label>Gender:</label>
			<form:radiobutton path="gender" value="Male" id="Male" />
			<label for="Male">Male</label>

			<form:radiobutton path="gender" value="Female" id="Female" />
			<label for="Female">Female</label><br> <br> <label
				for="AGE">Age</label>
			<form:input path="age" id="AGE" />
			<form:errors path="age" cssClass="error" />

			<hr>
			<label>Communication Details</label>
			<hr>
			<label for="email">Email</label>
			<form:input path="contact.email" id="email" />
			<form:errors path="contact.email" cssClass="error"/>
			<br><br>
			<label for="phone">Phone</label>
			<form:input path="contact.phone" id="phone" />
			<br> <br>
			<hr>
			<label>Payment Details</label>
			<hr>
			<label for="amount">Amount</label>
			<form:input path="details.amount" id="amount" />
			<br>
			<br> 
			<label for="Currency">Currency</label>
			<form:input path="details.currency" id="Currency" />
			<br> <br> <label for="Date">Date</label>
			<form:input path="details.date" id="Date" />
			<br> <br> <label for="credircard">CreditCard</label>
			<form:input path="details.creditcard" id="credircard" />
			<br> <br> <input type="submit" value="Login">
		</div>
	</form:form>
</body>
</html>