package com.dl.lms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dl.lms.entity.Student;

public class DeleteRecord {

	public void deleteStudentRecord(int studentId) {

		// Hibernate Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		Session openSession = buildSessionFactory.openSession();
		
		Student student =openSession.get(Student.class, studentId);
		
		Transaction beginTransaction = openSession.beginTransaction();
		
		openSession.delete(student);
		System.out.println("Student Record Deleted");
		
		beginTransaction.commit();

		// Detached State
		openSession.close();

		buildSessionFactory.close();

	}

	public static void main(String[] args) {

		DeleteRecord deleteRecord = new DeleteRecord();
		deleteRecord.deleteStudentRecord(1);
	}

}
