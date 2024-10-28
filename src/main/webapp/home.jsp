<%-- JSP Directive (for package imports, external tags) --%>
<%@page import="java.util.Scanner"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Page</title>
</head>
<body>
	<%-- JSP Declaration (goes OUTSIDE service() method) --%>
	<%! 
		int coef = 3;
		
	%>
	
	<h1>Hello world!</h1>
	
	<%-- JSP Scriptlet (goes INSIDE service() method --%>
	<%
		int i = 9;
		out.println(7+5);
		out.println("<br><br>");
	%>
	
	<%-- JSP Expression tag (for output --> becomes out.print()) --%>
	My fav number is : <%= coef %>
</body>
</html>