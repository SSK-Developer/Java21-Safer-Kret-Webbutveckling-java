<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>







<h1>You successfully logged in!</h1>

<form action="<%=request.getContextPath()%>/LogoutServlet" method="GET">
	<input type="submit" value="Logout" />
</form>

</body>
</html>