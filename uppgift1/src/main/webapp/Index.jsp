<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="include.jsp"/>

<form action = "check.jsp">
name: <input type="text" name="num">
	<select name="stuff">
	  <option value="page1.jsp">page1</option>
	  <option value="page2.jsp">page2</option>
	  <option value="page3.jsp">page3</option>
	</select>
	<input type="submit" value="Submit">
</form>

<jsp:include page="include.jsp"/>

</body>
</html>