package de.zeroco.assignment;

import java.util.Random;

public class GeneratingCaptcha {

	final static String dataone = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	public static String getCaptcha() {
		char inputdata[] = dataone.toCharArray();
		char captcha[] = new char[5];
		Random rdm = new Random();
		for (int i = 0; i < captcha.length; i++) {
			captcha[i] = inputdata[rdm.nextInt(inputdata.length)];
		}
		 new String(captcha);
		return getCaptcha(5);
	}

	public static String getCaptcha(int length) {
		if (length > 0 && length <= 52) {
			char inputdata[] = dataone.toCharArray();
			char captcha[] = new char[length];
			Random rdm = new Random();
			for (int i = 0; i < captcha.length; i++) {
				captcha[i] = inputdata[rdm.nextInt(inputdata.length)];
			}
			return new String(captcha);
		} else {
			return "Please enter a valid number between 1 to 52";
		}
	}

	public static String getCaptcha(int length, String type) {
		String data = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		if (length > 0 && length <= 62) {
			char inputdata[] = data.toCharArray();
			char captcha[] = new char[length];
			Random rdm = new Random();
			for (int i = 0; i < captcha.length; i++) {
				captcha[i] = inputdata[rdm.nextInt(inputdata.length)];
			}
			return new String(captcha);
		} else {
			return "Please enter a valid number between 1 to 62";
		}
	}
}
