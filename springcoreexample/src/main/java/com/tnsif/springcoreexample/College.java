package com.tnsif.springcoreexample;

public class College {
	private Student student;
	public College() {
		System.out.println("college object created....");
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
public void show() {
	System.out.println("Welcome to College");
	student.display();
}
}
