<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>


<% 


String Url = request.getParameter("stuff") + "?username=" + request.getParameter("num");
response.sendRedirect(Url);

//detta var min f�rsta l�sning men �ndrade l�sningen efter jag s�g din (Marcus) l�sning p� lektionen f�r den var mer effektiv och mindre kod.

/* String name=request.getParameter("stuff");  
if(name.equals("page1")){
	 response.sendRedirect("http://localhost:8080/uppgift1/page1.jsp");
}else if(name.equals("page2")){
	 response.sendRedirect("http://localhost:8080/uppgift1/page2.jsp");
}else if(name.equals("page3")){
	 response.sendRedirect("http://localhost:8080/uppgift1/page3.jsp");
} */


%>


</body>

</html>