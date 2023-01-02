package com.zc.training;

public class ForLoop {

	public static void main(String[] args) {
		int[] number = new int[] {5,6,7,8,9,10};
		System.out.println(someOfArrayi(number));
		
		//for each loop 
		for (int value : number) {
			System.out.println(" value are : " + value);
		}
		
	}
	
	/**
	 * This method is used to sum the array
	 * In this used for loop to extract values
	 * @param number
	 * @return
	 */
	public static int someOfArrayi(int[] number) {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		return sum;
	}
}
