package com.dl.lms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue()
	@Column(name="studentId")
	private int studentId;
	
	@Column(name="studentFirstName")
	private String studentFirstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="studentContact")
	private long studentContact;
	
	@Column(name="studentEmail")
	private String studentEmail;
	
	@Column(name="studentAddress")
	private String studentAddress;
	
	@Column(name="studentAdharNumber")
	private long studentAdharNumber;

	public Student() {
		
	}

	public Student(int studentId, String studentFirstName, String lastName, long studentContact, String studentEmail,
			String studentAddress, long studentAdharNumber) {
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.lastName = lastName;
		this.studentContact = studentContact;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
		this.studentAdharNumber = studentAdharNumber;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getStudentContact() {
		return studentContact;
	}

	public void setStudentContact(long studentContact) {
		this.studentContact = studentContact;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public long getStudentAdharNumber() {
		return studentAdharNumber;
	}

	public void setStudentAdharNumber(long studentAdharNumber) {
		this.studentAdharNumber = studentAdharNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", lastName=" + lastName
				+ ", studentContact=" + studentContact + ", studentEmail=" + studentEmail + ", studentAddress="
				+ studentAddress + ", studentAdharNumber=" + studentAdharNumber + "]";
	}

}
//id and generated value for adding primary key automatically .
//setters,constructor,to string-> pojo class.
//entity it will take that class as a table
//class name table name
//properties column name

