package de.zeroco.files;

public class StudentDetails {
	String rollno;
	String name;
	String mobileno;
	String marks;
	
	public StudentDetails(String rollno, String name, String mobileno, String marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.mobileno = mobileno;
		this.marks = marks;
	}
	public String toString() {
		return rollno + "," + name + "," + mobileno + "," + marks;
	} 
}
