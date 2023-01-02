package de.zeroco.map;

public class Student {

	int rollNo;
	String name;
	long mobNo;
	double marks;
	
	public Student(int rollNo, String name, long mobNo, double marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.mobNo = mobNo;
		this.marks = marks;
	}

	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", mobNo=" + mobNo + ", marks=" + marks + "]";
	}
}