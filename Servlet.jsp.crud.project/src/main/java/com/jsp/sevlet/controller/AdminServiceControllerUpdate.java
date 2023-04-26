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

@WebServlet("/updateAdmin")
public class AdminServiceControllerUpdate extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		Admin admin=new Admin();
		admin.setId(id);
		admin.setName(name);
		admin.setPhone(phone);
		admin.setEmail(email);
		admin.setPassword(password);
		AdminService service=new AdminService();
		Admin admin2=service.adminServiceUpdate(admin);
		PrintWriter out=resp.getWriter();
		out.print("Updated  "+admin2.getId());
		out.print("Updated  "+admin2.getName());
		out.print("Updated  "+admin2.getPhone());
		out.print("Updated  "+admin2.getEmail());
		out.print("Updated  "+admin2.getPassword());
		if(admin != null) {
			out.print("Updated  "+admin2.getId());
		}else {
			out.print(" Not Updated  "+ id);
		}
		
	}

}
