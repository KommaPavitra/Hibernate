package com.dl.lms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dl.lms.entity.Student;

public class UpdateRecord {

	public void updateStudentDetails(int studentId, String studentFirstName, String lastName, long studentContact,
			String studentEmail, String studentAddress, long studentAdharNumber) {

		// Hibernate Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		Session openSession = buildSessionFactory.openSession();

		Transaction beginTransaction = openSession.beginTransaction();
		
		Student student = openSession.get(Student.class, studentId);
		
		student.setStudentFirstName(studentFirstName);
		student.setLastName(lastName);
		student.setStudentEmail(studentEmail);
		student.setStudentContact(studentContact);
		student.setStudentAddress(studentAddress);
		student.setStudentAdharNumber(studentAdharNumber);
		System.out.println("Record Update");

		beginTransaction.commit();

		// Detached State
		openSession.close();
		buildSessionFactory.close();

	}
	
	public static void main(String[] args) {
		
		// Transient state
		UpdateRecord updateRecord = new UpdateRecord();
		
		// Persistent state
		updateRecord.updateStudentDetails(1, "Sai", "Kumar",  9876543210L, "saikumar@gmail.com", "Hyd", 78654312908L);
	}

}
