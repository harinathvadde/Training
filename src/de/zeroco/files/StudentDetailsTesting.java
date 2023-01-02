package de.zeroco.files;

import java.util.Arrays;

public class StudentDetailsTesting {

	public static void main(String[] args) {
		
		String rollnoOne = "abc@123";
		String nameOne = "Harinath";
		String marksOne = "73.5";
		String mobnoOne = "9652754858";
		String rollnoTwo = "abc@134";
		String nameTwo = "Ravi";
		String marksTwo = "69.5";
		String mobnoTwo = "9875641236";
		String rollnoThree = "abc@156";
		String nameThree = "Ashok";
		String marksThree = "69";
		String mobnoThree = "7896541239";
		String filePath = "G:\\student1.csv";

		StudentDetails studentDetails = new StudentDetails("RollNo","Name","Mobileno","Marks");
		StudentDetails studentDetailsOne = new StudentDetails(rollnoOne, nameOne, mobnoOne, marksOne);
		StudentDetails studentDetailsTwo = new StudentDetails(rollnoTwo, nameTwo, mobnoTwo, marksTwo);
		StudentDetails studentDetailsThree = new StudentDetails(rollnoThree, nameThree, mobnoThree, marksThree);
		
		System.out.println(FilesUtility.getFile(filePath));
		System.out.println(FilesUtility.fileWrite(filePath, studentDetails.toString()));
		System.out.println(FilesUtility.fileAppend(filePath, studentDetailsOne.toString()));
		System.out.println(FilesUtility.fileAppend(filePath, studentDetailsTwo.toString()));
		System.out.println(FilesUtility.fileAppend(filePath, studentDetailsThree.toString()));
		System.out.println(Arrays.toString(FilesUtility.readFile(filePath)));
		System.out.println(FilesUtility.removeData(filePath, mobnoOne));
		System.out.println(Arrays.toString(FilesUtility.readFile(filePath)));
	}
}   
