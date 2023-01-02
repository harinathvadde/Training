package com.zc.training;

public class MethodOverLoadingMain {

	public static void main(String[] args) {
		
		//inputs for addition method overloading
		int inputone = 20;
		int inputtwo = 48;
		int inputthree = 53;
		int inputfour = 69;
		
		//input for employee details
		String id = "ABC123";
		String name = "HARINATH";
		int age = 25;
		double sal = 20000;
		
		//calling MethodOverLoading class
		System.out.println(MetodOverLoading.add(inputone, inputtwo));
		System.out.println(MetodOverLoading.add(inputone, inputtwo, inputthree));
		System.out.println(MetodOverLoading.add(inputone, inputtwo, inputthree, inputfour));
		
		//calling MethodOverLoadingEmployeeDetails class
		System.out.println(MethodOverLoadingEmployeeDetails.employeeDetails(id));
		System.out.println(MethodOverLoadingEmployeeDetails.employeeDetails(id, name));
		System.out.println(MethodOverLoadingEmployeeDetails.employeeDetails(id, name, age));
		System.out.println(MethodOverLoadingEmployeeDetails.employeeDetails(id, name, age, sal));
	}
}
