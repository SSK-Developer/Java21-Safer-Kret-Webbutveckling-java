<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.WeatherBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>the weather</title>
<link rel="stylesheet" href="style.css">
</head>
<body>


	<!-- creating a div-tag around this java-code to be able and style it in my css later.  -->
	<div class="ShowWeatherForm">
		<%
		//Instancing weatherbean klass by getting attribute 
		WeatherBean wBean = (WeatherBean) request.getAttribute("wBean");
		//using my getters to get data and printing it out
		out.print(wBean.getCityStr() + ", " + wBean.getCountryStr() + "<br>");
		out.print("Cloud status: " + wBean.getCloudsStr() + "<br>");
		out.print("Temperature: " + wBean.getTemperatureCelsius() + "C <br>");
		out.print("Last updated date: " + wBean.getDateStr());
		%>
	</div>












</body>
</html>