package com.jsp.sevlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sevlet.dto.Admin;
import com.jsp.sevlet.service.AdminService;
@WebServlet("/getadminbyid")
public class GetAdminServletById  extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//int id=Integer.parseInt(req.getParameter("id"));
		int id=Integer.parseInt(req.getParameter("getid"));
		PrintWriter out=resp.getWriter();
		out.print("Di "+id);
		
		//AdminService  service=service.adminServiceUpdate(id);
		AdminService service=new AdminService();
		Admin admin=service.adminServiceGetByid(id);
		
		if( admin != null) {
			
			req.setAttribute("updateadmin", admin);
			RequestDispatcher dispatcher=req.getRequestDispatcher("editUpdate.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("editAdmin.jsp");
			dispatcher.include(req, resp);
		}
		
	}

}
