package com.dl.client;

import com.dl.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CreateRecord {

	public static void main(String[] args) {
		
		//Transient state.
		Student student = new Student();
		student.setStudentFirstName("Sai");
		student.setStudentLastName("Kiran");
		student.setStudentEmail("saikiran@gmail.com");
		student.setStudentContact(9876543210L);
		student.setStudentAddress("Hyd");
		student.setStudentAdharNumber(6786785674L);
		
		//Hibernate Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		
		Session openSession = buildSessionFactory.openSession();
		
		Transaction beginTransaction = openSession.beginTransaction();
		
		//Persistent state
		openSession.save(student);
		System.out.println("Data Insterted");
		
		beginTransaction.commit();
		
		//Detached State
		openSession.close();
		
		buildSessionFactory.close();
		
	}
	

}
