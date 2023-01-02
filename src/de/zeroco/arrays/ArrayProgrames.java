package de.zeroco.arrays;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayProgrames {

	public static int sumOfArray(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	public static String sortingArray(int[] numbers) {
		String res = "";
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			res += numbers[i];
		}
		return res;
	}
	
	/**
	 * This method returns the reverse of given string
	 * @param input
	 * @return
	 * @throws NullPointerException
	 */
	public static String reverseString(String input) throws NullPointerException {
		String rev = "";
		for (int i = input.length() - 1; i >= 0 ; i--) {
			rev += input.charAt(i);
		}
		return rev;
	}

	/**
	 * This method returns the palindrome strings only 
	 * palindrome string means reversed string is equals to given input string
	 * @param inputalphabet
	 * @return
	 * @throws NullPointerException
	 */
	public static String stringPalindrome(String[] inputalphabet) throws NullPointerException {
		String reverse = "";
		for (int i = 0; i < inputalphabet.length; i++) {
			if (reverseString(inputalphabet[i]).equals(inputalphabet[i])) {
				reverse += inputalphabet[i] + " ";
			}
		}
		return reverse; 
	}
	/**
	 * This metod checks the string or not and returns string only
	 * @author HARINATH
	 * @since 02/12/2022
	 * @param input
	 * @return Output String
	 */
	public static String isAString(String input) {
		String res = "";
		char ch[] =   input.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				res += ch[i];
			} 
		}
		return res;
	}
	
	/**
	 * This method will seaprate the data string , int, char in the given array
	 * @author HARINATH
	 * @since 02/12/2022
	 * @param input
	 * @return separated data
	 */
	public static String separateAlphaNumarics(Object[] input) {
		String stringres = "";
		String numberres = "";
		String charres = "";
		for (int i = 0; i < input.length; i++) {
			if (input[i] instanceof String) {
				String strvar = (String) input[i];
				stringres += isAString(strvar) + " , ";
			} else if(input[i] instanceof Integer) {
				numberres += input[i] + " , ";
			} else if (input[i] instanceof Character) {
				charres += input[i] + " , ";
			} else {
				return  "";
			}
		}
		return stringres + numberres + charres ;
	}
}








