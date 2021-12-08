<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page 2</title>
</head>
<body>

<header>THIS IS A HEADER</header>

<%


String name=request.getParameter("username");
out.println("<h1>Welcome " + name + "!</h1>");
out.println("<h2>This is the second page</h2>");

%>

<footer>THIS IS A FOOTER</footer>


</body>
</html>