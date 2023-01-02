package com.zc.strings;

public class VowelsConsonants {

	public static String countOfVowelsConsonants(String input) {
		int countvowels = 0;
		int countconsonants = 0;
		for (int i = 0; i < input.length(); i++) {
			char res = input.charAt(i);
			if (res == 'a' || res == 'e' || res == 'i' || res == 'o' || res == 'u') {
				countvowels++;
			} else {
				countconsonants++;
			}
		}
		return "count of vowels : " + countvowels + " , " + "count of consonents : " + countconsonants; 
	}
}
