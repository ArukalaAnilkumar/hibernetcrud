package com.jsp.sevlet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sevlet.dto.Admin;
import com.jsp.sevlet.service.AdminService;
@WebServlet("/editupdate")
public class AdminServletEditUpdate extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println();
		Admin admin=new Admin();
		int id=Integer.parseInt(req.getParameter("id"));
		admin.setId(Integer.parseInt(req.getParameter("id")));
		admin.setName(req.getParameter("name"));
		admin.setPhone(req.getParameter("phone"));
		admin.setEmail(req.getParameter("email"));
		admin.setPassword(req.getParameter("password"));
		
		AdminService service=new AdminService();
		Admin admin2=service.adminServiceUpdate(admin);
		
		if( admin2 != null) {
			
			//req.setAttribute("updateadmin", admin);
			RequestDispatcher dispatcher=req.getRequestDispatcher("HomePage.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("");
			dispatcher.include(req, resp);
		}
		
	}

}
