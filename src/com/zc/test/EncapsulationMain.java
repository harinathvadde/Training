package com.zc.test;

import com.zc.encapsulation.Student;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		String id = "ABC@123";
		String name = "HARINATH";
		Long mobileno = 9652754858l;
		double marks = 73.5;
		
		Student studs = new Student(name);
		studs.setId(id);
		studs.setMobileno(mobileno);
		studs.setMarks(marks);
		System.out.println(studs.toString());
		
	}
}
