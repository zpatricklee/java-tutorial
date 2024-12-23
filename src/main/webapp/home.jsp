<%-- JSP Directive (for package imports, external tags) --%>
<%@page import="java.util.Scanner"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
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
	<br>
	
	<% 
		pageContext.setAttribute("name", "Patrick", PageContext.SESSION_SCOPE);
	%>
	
	<%--
		int k = 9 / 0;
	--%>
</body>
</html>

<%-- 
	Built-in Object (can be used in Scriptlet and Expression
	Request (HttpServletRequest)
	Response (HttpServletResponse)
	PageContext (PageContext)
	Out (JspWriter) ~ PrintWriter object
	Session (HttpSession)
	Application (ServletContext)
	Config (ServletConfig)
--%>