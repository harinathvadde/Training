package com.zc.strings;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
	
	public static void main(String[] args) {
		
		//1st way
		Pattern ptrn = Pattern.compile("...i");	//. represents single character
		Matcher mtcr = ptrn.matcher("hari");
		boolean res = mtcr.matches();
		System.out.println(res);
		
		//2nd way
		boolean restwo = Pattern.compile(".s").matcher("as").matches();
		System.out.println(restwo);
		
		//3rd way
		boolean resthree = Pattern.matches("..e", "sie");
		System.out.println(resthree);
		System.out.println(Pattern.matches("..a", "kje"));
		System.out.println(Pattern.matches("[abc]", "abc"));
		System.out.println(Pattern.matches("[sjk]", "k"));
		System.out.println(Pattern.matches("[^abc]", "a"));
		System.out.println(Pattern.matches("[a-zA-S]", "e"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]*", "Harinathvadde46"));	
	}
}
