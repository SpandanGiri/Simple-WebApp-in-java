package com.robin;
import java.io.IOException;
import com.robin.Dbtools;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserAuthServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		HttpSession session = req.getSession();
		PrintWriter pw = res.getWriter();
				
		String username = (String)session.getAttribute("fname");
		System.out.println(username);
		
		try {
			if(Dbtools.auth(username)) {
				pw.println(username + " is Authenticated");
			}
			else {
				pw.println(username + " Access Denied");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		
		
	}
}
