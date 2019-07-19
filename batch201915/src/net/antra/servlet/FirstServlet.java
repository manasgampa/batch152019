package net.antra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{

	public void init() {
		System.out.println("in init method of first servlet");
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		System.out.println("in first servlet");
		PrintWriter out=response.getWriter();
		out.println("<h1>welcome to first servlet</h1>");
	}
	
	public void destroy() {
		System.out.println("in destroy method");
	}
}
