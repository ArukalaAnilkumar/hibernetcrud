package com.jsp.sevlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.sevlet.dto.Admin;
import com.jsp.sevlet.service.AdminService;

@WebServlet("/adminsave")
public class AdminServletControllerSave extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println();
		int id=Integer.parseInt(req.getParameter("getid"));
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
		Admin admin2=service.adminServiceSave(admin);
		PrintWriter out=resp.getWriter();
		if(admin2 != null) {
			
			out.print("Data Saved...!");
			//req.setAttribute("updateadmin", admin);
			RequestDispatcher dispatcher=req.getRequestDispatcher("HomePage.jsp");
			dispatcher.forward(req, resp);
		}else {
			out.print("Data not Saved...!");
		//	req.setAttribute("updateadmin", admin);
			RequestDispatcher dispatcher=req.getRequestDispatcher("savedata.jsp");
			dispatcher.include(req, resp);
		}
		
	
		
	}

}
