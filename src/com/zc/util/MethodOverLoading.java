package com.zc.util;

public class MethodOverLoading {

	public double mul(double inputone, double inputtwo) {
		return inputone * inputtwo;
	}
	
	public double mul(double inputone, double inputtwo, double inputthree) {
		return inputone * inputtwo * inputthree;
	}
	
	public double mul(double inputone, double inputtwo, double inputthree, double inputfour) {
		return inputone * inputtwo * inputthree * inputfour;
	}
}
