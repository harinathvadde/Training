package com.zc.test;

import com.zc.interfacee.*;

public class MultipleInterfaceMain {

	public static void main(String[] args) {
		double dia = 20;
		double discharge = 0.21;
		
		MultipleInterface mic = new MultipleInterfaceClass();
		System.out.println(mic.areaOfPipe(dia));
		System.out.println(mic.velocity(dia, discharge));
		System.out.println(mic.savingsAccount());
		System.out.println(mic.loanAccount());
		System.out.println(mic.print());
	}
}
