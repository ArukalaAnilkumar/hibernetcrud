package com.jsp.sevlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sevlet.dto.Admin;
import com.jsp.sevlet.service.AdminService;
@WebServlet("/getalldata")
public class GetAdminServletAll extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		AdminService service=new AdminService();
		List<Admin> admin=service.adminServiceGetByAll();
		PrintWriter out=resp.getWriter();
		for(int i=0; i<admin.size(); i++) {
			out.print("id :"+admin.get(i).getId()+" ");
			out.print("Name :"+admin.get(i).getName()+" ");
			out.print("Phone :"+admin.get(i).getPhone()+ " ");
			out.print("Email :"+admin.get(i).getEmail()+ " ");
			out.print("Password :"+admin.get(i).getPassword()+ " ");
			out.println();
			out.print("---------------------------");
			out.println();
		}
	}

}
