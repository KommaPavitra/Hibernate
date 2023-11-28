package com.dl.lms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dl.lms.entity.Student;

public class ReadRecord {

	public static void main(String[] args) {

		//Student student = new Student();

		// Hibernate Configuration
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory buildSessionFactory = configuration.buildSessionFactory();

		Session openSession = buildSessionFactory.openSession();

		Transaction beginTransaction = openSession.beginTransaction();

		Student student = openSession.get(Student.class, 1);

		System.out.println(student);

		beginTransaction.commit();

		// Detached State
		openSession.close();

		buildSessionFactory.close();
	}

}
