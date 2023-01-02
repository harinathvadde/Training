package com.zc.exception;

public class LoginPage {

	public Object checkUserPassword(String user, String pass) {
		Object res = 0;
		try {
			res = (user.equals("harinath46")) && (pass.equals("Hari@123"));
		}catch (Exception e) {
			res = "please enter a value : " + e;
		} 
		return res;
	}
	
	public String checkLoginDetails(String user, String pass) throws NullPointerException {
		if ((user.equals("harinath46")) && (pass.equals("Hari@123"))) {
			return "Login Successfully..!!";
		} else {
			return "enter valid details..!!";
		}
	}
}
		 
	
