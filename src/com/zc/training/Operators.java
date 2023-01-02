package com.zc.training;

public class Operators {

	public static void main(String[] args) {
		
		//simple assignment operators
		
		int num = 10; 	//= is the assignment operator used to assign a value to the variable
		
		//Arthimatic Operators
		
		int a = 10;
		int b = 20;
		
		int add = a + b; 	// + is the additive operator
		String s = " output is " + add;		// + is also used to concatination
		int sub = a - b; 	// - is subtraction operator
		int mul = a * b; 	// * is Multiplication Operator
		int div = a / b;	// / is division operator
		int modulus = a % b; 	// % is to find reminder 
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(modulus);
		
		//Unary Operators
		a++;	//post increment operator
		++a; 	//pre increment operator
		b--;	//post decremental operator
		--b;	//pre decremental operator
		
		//Equality and relational Operator
		
		if (a == b) {
			System.out.println(" equal operator ");
		} else if (a != b) {
			System.out.println(" not equal method ");
		} else if (a > b) {
			System.out.println("  Greater than operator ");
		} else if (a >= b) {
			System.out.println(" Greater than or equals to operator ");
		} else if (a < b) {
			System.out.println(" Less than operator ");
		} else if (a <= b) {
			System.out.println(" Less than or equals to operator ");
		}
			
		//conditional operators
		
		boolean res = (a < b) && (a != b);		// && is when two conditions true then only res will be true	
		System.out.println(res);
		boolean res1 = (a > b) || (a == b);		// || is when any one condition will be true then res will be true
		System.out.println(res1);
		
		int res2 =  (a < b) ? a : b;			//conditional operator
		System.out.println(res2);
		}
	}

