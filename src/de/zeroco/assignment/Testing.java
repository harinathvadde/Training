package de.zeroco.assignment;

public class Testing {

	public static void main(String[] args) {
		int length = 5;
		String type = "alphanumaric";
		String data = "Dear customer, Your ticket number is : {{HYDTS123456}}. Happy Journey";
		String startingchar = "{";
		String endingchar = "}";
		String password = "Zerocode@123";
		
		System.out.println(Utility.getCaptcha());
		System.out.println(Utility.getCaptcha(length));
		System.out.println(Utility.getCaptcha(length, type));
		System.out.println(Utility.findString(data, startingchar, endingchar));
		System.out.println(Utility.isValidPassword(password));
	}
}