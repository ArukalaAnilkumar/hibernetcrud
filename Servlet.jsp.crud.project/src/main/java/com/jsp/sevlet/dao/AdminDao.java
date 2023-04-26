package com.jsp.sevlet.dao;

import java.io.PrintWriter;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.sevlet.dto.Admin;

public class AdminDao {

	public static 	EntityManagerFactory entityManagerFactory;
	public static Admin adminSave(Admin admin) {
		// TODO Auto-generated method stub
		
		System.out.println();
		entityManagerFactory=Persistence.createEntityManagerFactory("staranil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		if(admin != null) {
			
			entityTransaction.begin();
			entityManager.persist(admin);
			entityTransaction.commit();
		}
		return admin;
	}
	


	public static Admin adminGetByid(int id) {
		entityManagerFactory=Persistence.createEntityManagerFactory("staranil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		return entityManager.find(Admin.class, id);
		
	}
	
	public Admin adminUpdate(Admin admin) {
		// TODO Auto-generated method stub           problem

		entityManagerFactory=Persistence.createEntityManagerFactory("staranil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityManager.find(Admin.class, admin.getId());
		if(admin != null) {
		entityTransaction.begin();
		entityManager.merge(admin);
		entityTransaction.commit();
		}
		return admin;
	}
	
//	public Admin adminUpdate(int id) {
//		// TODO Auto-generated method stub           problem
//
//		entityManagerFactory=Persistence.createEntityManagerFactory("staranil");
//		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		
//		Admin admin=entityManager.find(Admin.class, id);
//		if(admin != null) {
//		entityTransaction.begin();
//		entityManager.merge(admin);
//		entityTransaction.commit();
//		}
//		return admin;
//	}
	
	public List<Admin> getAllAdmin(){
		
		entityManagerFactory =Persistence.createEntityManagerFactory("staranil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Query query=entityManager.createQuery("select a from Admin a");
		
		return query.getResultList();
		
	}
	public static Admin adminDelete(int id) {
	
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("staranil");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction eTransaction=entityManager.getTransaction();
		
		Admin user=entityManager.find(Admin.class, id);
	
		if(user != null) {
			
			eTransaction.begin();
			entityManager.remove(user);
			eTransaction.commit();
			
		}
		return user;
		
	}
	
}
