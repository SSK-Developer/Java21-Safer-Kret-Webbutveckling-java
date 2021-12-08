<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page 3</title>
</head>
<body>

<jsp:include page="include.jsp"/>
<%
String name=request.getParameter("username");
out.println("<h1>Welcome " + name + "!</h1>");
out.println("<h2>This is the third page</h2>");


%>

<jsp:include page="include.jsp"/>

</body>
</html>