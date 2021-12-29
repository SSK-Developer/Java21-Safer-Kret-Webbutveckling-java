<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OpenWeather</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<!-- creating a form to get data from user -->
	<form action="OWservlet" method="get" class="indexForm">
		City:<input type="text" name="city" /> <br /> Country (Language
		code):<input type="text" name="country" /> <br /> <input
			class="button" type="submit" value="SUBMIT" />
	</form>

	<!-- creating div-tag around this java-code to be able and style it later in my css -->
	<div class="preSearches">
		<%
		//getting my cookies and storing them in a list
		Cookie[] cookies = request.getCookies();

		//creating a if statment that looks if there is any value in cookies list.
		if (cookies != null) {
			out.print(" <br> Earlier searches ");
			//for loop that loops through cookies-list and printing out value and name in the cookies.
			for (int i = 0; i < cookies.length; i++) {
				out.print("<br>" + cookies[i].getName().toUpperCase() + ": " + cookies[i].getValue());//printing name and value of cookie  
			}
		}
		%>
	</div>

</body>
</html>