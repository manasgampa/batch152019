package net.antra.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieEx extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		Cookie ck1=new Cookie("uName","manas");
		ck1.setMaxAge(45);
		Cookie ck2=new Cookie("pass","1234");
		response.addCookie(ck1);
		response.addCookie(ck2);
	}

}
