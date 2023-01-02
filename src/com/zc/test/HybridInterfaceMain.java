package com.zc.test;

import com.zc.interfacee.*;

public class HybridInterfaceMain {

	public static void main(String[] args) {
		double dia = 20;
		double discharge = 0.21;
		
		HybridInterfaceClass hybrid = new HybridInterfaceClass();
		System.out.println(hybrid.areaOfPipe(dia));
		System.out.println(hybrid.velocity(dia, discharge));
		System.out.println(hybrid.savingsAccount());
		System.out.println(hybrid.loanAccount());
		System.out.println(hybrid.print());
		System.out.println(hybrid.disply());
		System.out.println(hybrid.test());
	}
}
