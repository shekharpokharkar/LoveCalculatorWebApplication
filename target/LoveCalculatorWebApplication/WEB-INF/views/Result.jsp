<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Love Calculator</title>
</head>
<body>
	<h1 align="center">Love Calculator App</h1>
	<hr>
	<div align="center">
	<h2>The Love Calculator Predicts:</h2>
	<h2>${Login.userName} and ${Login.crushName} are :</h2>
	<h2>${Login.result}</h2>
		<br><br>
		
		<a href="/LoveCalculatorWebApplication/sendEmail">Send Result to Email</a>
		
	</div>
</body>
</html>