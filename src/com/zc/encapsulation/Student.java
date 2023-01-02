package com.zc.encapsulation;

public class Student {

	private String id;
			String name;
	private Long mobileno;
	private double marks;
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + getId() + ", name=" + name + ", mobileno=" + getMobileno() + ", marks=" + getMarks() + "]";
	}
}
