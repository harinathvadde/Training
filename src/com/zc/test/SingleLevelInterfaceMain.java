package com.zc.test;

import com.zc.interfacee.*;

public class SingleLevelInterfaceMain {

	public static void main(String[] args) {
		
		double diameter = 0.25;
		double discharge = 0.12;
		
		SingleLevelClass slc = new SingleLevelClass();
		System.out.println("Area of pipe a : ");
		System.out.println(slc.areaOfPipe(diameter));
		System.out.println("velocity V : ");
		System.out.println(slc.velocity(slc.areaOfPipe(diameter), discharge));
		System.out.println("velocity head : ");
		System.out.println(slc.velocityhead(slc.velocity(slc.areaOfPipe(diameter), discharge)));
	}
}
