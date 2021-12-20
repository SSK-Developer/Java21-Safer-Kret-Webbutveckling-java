<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="model.WeatherBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>the weather</title>
</head>
<body>




	<%
	WeatherBean wBean = (WeatherBean) request.getAttribute("wBean");
	out.print(wBean.getCityStr() + ", " + wBean.getCountryStr()+ "<br>");
	out.print("Cloud status: " + wBean.getCloudsStr() + "<br>");
	out.print("Temperature: " + wBean.getTemperatureCelsius()+ "C <br>");
	out.print("Last updated date: " + wBean.getDateStr());
	%>












</body>
</html>