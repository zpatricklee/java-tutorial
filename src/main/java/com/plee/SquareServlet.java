package com.plee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int k = (int) req.getAttribute("k");
		k = k * k;
		
		PrintWriter out = resp.getWriter();
		out.println("The square of k is " + k);
		
		System.out.println("square called");
	}

}
