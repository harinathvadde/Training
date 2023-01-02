package com.zc.test;

import de.zeroco.arrays.ArrayElementIndex;

public class ArrayElementIndexMain {

	public static void main(String[] args) {
		
		int numbers[] = new int[] {5,4,8,7,9,6,2,1,9,7,6};
		int numberone[] = new int[] {5,20,3,1,18,6};
		
		System.out.println("Even element index values : " + ArrayElementIndex.findEvenElementIndex(numbers));
		System.out.println("Even index element values : " + ArrayElementIndex.findEvenIndexElements(numbers));	
		System.out.println("Duplicate values in array : " + ArrayElementIndex.findDuplicate(numbers));
		System.out.println("Max value of array : " + ArrayElementIndex.findMaxElement(numberone));
	}
}
