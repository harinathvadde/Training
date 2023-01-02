package de.zeroco.arrays;

public class ArrayElementIndex {

	public static String findEvenElementIndex(int[] numbers) {
		String res = "";
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				res += i + " ";
			}
		}
		return res;
	}
	
	public static String findEvenIndexElements(int[] numbers) {
		String res = "";
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				res += numbers[i] + " ";
			}
		}
		return res;
	}
	
	public static String findDuplicate(int[] numbers) {
		String res = "";
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					res += numbers[i] + " ";
				}
			}
		}
		return res;
	}
	
	public static int findMaxElement(int[] numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
}
