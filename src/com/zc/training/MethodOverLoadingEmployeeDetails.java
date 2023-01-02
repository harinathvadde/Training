package com.zc.training;

public class MethodOverLoadingEmployeeDetails {

	public static String employeeDetails(String id) {
		return id;
	}
	public static String employeeDetails(String id, String name) {
		return id + " , " + name;
	}
	
	public static String employeeDetails(String id, String name, int age) {
		return id + " , " + name + " , " + age;
	}
	
	public static String employeeDetails(String id, String name, int age, double sal) {
		return id + " , " + name + " , " + age + " , " + sal;
	}
}
