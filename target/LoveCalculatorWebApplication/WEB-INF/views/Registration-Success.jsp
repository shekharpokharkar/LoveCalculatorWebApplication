<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Registration successfully</h2>
<hr>
Name:${Registration.name}<br>
UserName:${Registration.userName}<br>
Password:${Registration.password}<br>
Country:${Registration.country}<br>
Gender:${Registration.gender}<br>
Age:${Registration.age}<br>
Email:${Registration.contact.email}<br>
PhoneNumber:${Registration.contact.phone}<br>
CreditCard Details:${Registration.details.creditcard}<br>
Amount:${Registration.details.amount}<br>
Date:${Registration.details.date}<br>
Currency:${Registration.details.currency}<br>
<br>

</body>
</html>