package net.antra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		int i=10;
		int j=20;
		int k=i+j;
		System.out.println(k);
		PrintWriter out=response.getWriter();
		out.print("welcome to 3rd servlet");
		
	}
	
}
