package net.antra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		String sID=request.getParameter("studentID");
		String sName=request.getParameter("studentName");
		String sMarks=request.getParameter("studentMarks");
		
		PrintWriter out=response.getWriter();
		out.println("you have enterd the details");
		out.println(sID);
		out.println(sName);
		out.println(sMarks);
		
		
	}

}
