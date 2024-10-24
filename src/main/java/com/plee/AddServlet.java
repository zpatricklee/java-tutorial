package com.plee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i + j;
		
		Cookie cookie = new Cookie("k", k + "");
		resp.addCookie(cookie);
		
		// can maintain data using sessions, cookies, and URL redirect
		resp.sendRedirect("square"); 

//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, resp);
		
	}
}
