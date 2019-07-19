package net.antra.servlet;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet{

	public void service(HttpServletRequest request, HttpServletResponse response) {
		
		HttpSession hSession=request.getSession(false);
		/*String str=(String) hSession.getAttribute("uname");
		System.out.println(str);*/
		/*Cookie ck[]=request.getCookies();
		for(int i=0;i<ck.length;i++) {
			
			System.out.println(ck[i].getName());
			System.out.println(ck[i].getValue());
		}*/
		
		System.out.println("in second servlet");
	}
}
