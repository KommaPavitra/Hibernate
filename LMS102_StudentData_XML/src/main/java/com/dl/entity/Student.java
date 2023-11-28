package com.dl.entity;

public class Student {
private int studentId;
	
	private String studentFirstName;
	
	private String studentLastName;
	
	private long studentContact;
	
	private String studentEmail;
	
	private String studentAddress;
	
	private long studentAdharNumber;
	
	public Student() {
		
	}

	public Student(int studentId, String studentFirstName, String studentLastName, long studentContact,
			String studentEmail, String studentAddress, long studentAdharNumber) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
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

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
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
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentContact=" + studentContact + ", studentEmail=" + studentEmail
				+ ", studentAddress=" + studentAddress + ", studentAdharNumber=" + studentAdharNumber + "]";
	}
	
	

}
