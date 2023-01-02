package com.zc.test;

import de.zeroco.arrays.ArrayProgrames;

public class ArrayProgramesMain {

	public static void main(String[] args) {
		
		int inputnumbers[] = new int[] {2,6,4,7,9,6,5};
		String inputnames[] =new String[] {"amma","hari","malayalam","java","12921","5943"};
		String input[] = null;
		Object inputtwo[] = new Object[] {3,"hari",125,"java",975,'a',658,"zerocode",'t',4,"time",'@'};
		
		System.out.println("Sum of array elements : " + ArrayProgrames.sumOfArray(inputnumbers));
		System.out.println("Sorting of array elements : " + ArrayProgrames.sortingArray(inputnumbers));
		System.out.println(ArrayProgrames.stringPalindrome(inputnames));
		try {
			System.out.println(ArrayProgrames.stringPalindrome(input));
		} catch (Exception e) {
			System.out.println("Please enter valid input " + e);
		}
		
		System.out.println(ArrayProgrames.separateAlphaNumarics(inputtwo));
	}
}
