package net.antra.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionEx extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession hSession=request.getSession();
		System.out.println(hSession.getId());
		System.out.println(hSession.isNew());
		hSession.setAttribute("uname", "Yi Chai");
		
	}

}
