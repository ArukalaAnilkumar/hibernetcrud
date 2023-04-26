package com.jsp.sevlet.service;

import java.util.List;

import com.jsp.sevlet.dao.AdminDao;
import com.jsp.sevlet.dto.Admin;

public class AdminService {
	
	static AdminDao dao=new AdminDao();
	
	public static Admin adminServiceSave(Admin admin) {
		return dao.adminSave(admin);
		
	}
	public static Admin adminServiceGetByid(int id) {
		
		return dao.adminGetByid(id);
		
	}
	public Admin adminServiceUpdate(Admin admin) {
		// TODO Auto-generated method stub
		return dao.adminUpdate(admin);

	}
	public static List<Admin> adminServiceGetByAll() {
		return dao.getAllAdmin();
	}
	public static Admin adminServiceDelete(int id) {
		return dao.adminDelete(id);
		
	}

}
