package com.zc.util;

public class PersonDetails {

	String name;
	String rollno;
	String gender;
	long mobileno;
	Subject subj;
	
	
	public PersonDetails(String name, String rollno, String gender, long mobileno, Subject subj) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.gender = gender;
		this.mobileno = mobileno;
		this.subj = subj;
	}

	public void display() {
		System.out.println("Name     : " + name);
		System.out.println("Rollno   : " + rollno);
		System.out.println("Gender   : " + gender);
		System.out.println("MobileNo : " + mobileno);
		System.out.println("************Marks in Subjects************");
		System.out.println("Telugu   : " + subj.telugu);
		System.out.println("Hindi    : " + subj.hindi);
		System.out.println("English  : " + subj.english);
		System.out.println("Maths    : " + subj.maths);
		System.out.println("Science  : " + subj.science);
		System.out.println("Social   : " + subj.social);
	}
}
