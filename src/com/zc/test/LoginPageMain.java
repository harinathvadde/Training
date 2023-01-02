package com.zc.test;

import com.zc.exception.LoginPage;

public class LoginPageMain {

	public static void main(String[] args) {
		
		//By passing correct details
		String user = "harinath46";
		String pass = "Hari@123";
		
		//By passing incorrect details 
		String userone = "harinath45";
		String passone = "Hari@123";
		
		//By passing null value
		String usertwo = null;
		String passtwo = "Hari@123";
		
		Object res = true;
		LoginPage lgpage = new LoginPage();
		System.out.println(lgpage.checkUserPassword(user, pass));
		System.out.println(lgpage.checkUserPassword(userone, passone));
		System.out.println(lgpage.checkUserPassword(usertwo, passtwo));
		
		//checking exception by throws exception
		try {
			System.out.println(lgpage.checkLoginDetails(user, passtwo));
		} catch (Exception e) {
			System.out.println("your not entered detaisl fill details " + e);
		}
	}
}
