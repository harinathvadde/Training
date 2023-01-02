package com.zc.test;

import com.zc.util.ConstructorChaining;

public class ConstuctorChainingMain {

	public static void main(String[] args) {
		
		int valueone = 38;
		int valuetwo = 49;
		int valuethree = 20;
		int valuefour = 59;
		
		//creating object 
		ConstructorChaining c = new ConstructorChaining(valueone, valuetwo, valuethree, valuefour);
		c.disply();
	}
}
