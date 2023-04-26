package com.jsp.sevlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sevlet.dto.Admin;
import com.jsp.sevlet.service.AdminService;
@WebServlet("/getByidAdmin")
public class AdminServletControllergetByid extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		int id=Integer.parseInt(req.getParameter("getname"));
		AdminService service=new AdminService();
		Admin admin2=service.adminServiceGetByid(id);
		PrintWriter out=resp.getWriter();
		if(admin2 != null) {
		
			out.print("User id :"+ admin2.getId());
		}
	}

}
