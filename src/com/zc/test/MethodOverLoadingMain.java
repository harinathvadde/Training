package com.zc.test;

import com.zc.util.*;

public class MethodOverLoadingMain {

	public static void main(String[] args) {
		
		double inputone = 52.3;
		double inputtwo = 6.4;
		double inputthree = 40;
		double inputfour = 2;
		
		MethodOverLoading mol = new MethodOverLoading();
		System.out.println(mol.mul(inputone, inputtwo));
		System.out.println(mol.mul(inputone, inputtwo, inputthree));
		System.out.println(mol.mul(inputone, inputtwo, inputthree, inputfour));
	}
}
