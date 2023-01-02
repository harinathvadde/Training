package de.zeroco.arrays;

public class MultiDimentionalArrays {

	public static void main(String[] args) {
		
		//Array declaration
		int number[][] = new int[2][2];
		//initialization
		number[0][0] = 10;
		number[0][1] = 20;
		number[1][0] = 30;
		number[1][1] = 40;
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number.length; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
