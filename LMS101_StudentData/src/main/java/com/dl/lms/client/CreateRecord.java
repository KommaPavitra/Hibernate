package com.dl.lms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dl.lms.entity.Student;

public class CreateRecord {

	public static void main(String[] args) {
		//Transient state.
				Student student = new Student();
				student.setStudentFirstName("Sai");
				student.setLastName("Kiran");
				student.setStudentEmail("saikiran@gmail.com");
				student.setStudentContact(9876543210L);
				student.setStudentAddress("Hyd");
				student.setStudentAdharNumber(6786785674L);
				
				// HIbernate Configuration
				Configuration configuration = new Configuration();
				configuration.configure("hibernate.cfg.xml");
				
				SessionFactory buildSessionFactory = configuration.buildSessionFactory();
				
				Session openSession = buildSessionFactory.openSession();
				
				Transaction beginTransaction = openSession.beginTransaction();
				
				//Persistent state
				openSession.save(student);//customer object reference.
				System.out.println("Data Insterted");
				
				beginTransaction.commit();
				
				//Detached State
				openSession.close();
				
				buildSessionFactory.close();
				
			}
	}


