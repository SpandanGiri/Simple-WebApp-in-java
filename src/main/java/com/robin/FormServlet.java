package com.robin;
import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		
		
		HttpSession session = req.getSession();
		session.setAttribute("fname", fname);
		
		res.sendRedirect("home");
		
	}
}