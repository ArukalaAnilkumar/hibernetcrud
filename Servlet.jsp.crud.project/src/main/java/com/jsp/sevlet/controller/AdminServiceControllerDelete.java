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
@WebServlet("/deletebyid")
public class AdminServiceControllerDelete extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("getid"));


		AdminService service=new AdminService();
		Admin admin=service.adminServiceDelete(id);
	
		PrintWriter out=resp.getWriter();
		if(admin != null) {
			out.println("Deleted");
			RequestDispatcher dispatcher=req.getRequestDispatcher("HomePage.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("deleteid.jsp");
			dispatcher.include(req, resp);
		}
	}
}
