package com.plee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ServletConfig and ServletContext
 */

public class MyServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.print("Hi<br>");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.println(str + "<br>");
		
		ServletConfig cfg = getServletConfig();
		String s = cfg.getInitParameter("name");
		out.print("Bye <br>" + s);
	}
}
