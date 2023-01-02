package de.zeroco.assignment;

import java.util.regex.Pattern;

public class PasswordValidation {

	public static boolean isValidPassword(String password) throws NullPointerException {
		return Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$#@&!]).{8,15}$").matcher(password).find();
	}
}
 