package com.zc.test;

import com.zc.interfacee.*;

public class MultiLevelInterfaceMain {

	public static void main(String[] args) {
		
		double diameter = 0.25;
		double discharge = 0.12;
		double pressure = 2000;
		double height = 3;
		
		MultiLevelInterfaceClass multiinterface = new MultiLevelInterfaceClass();
		System.out.println("Area of pipe a : ");
		System.out.println(multiinterface.areaOfPipe(diameter));
		System.out.println("velocity V : ");
		System.out.println(multiinterface.velocity(multiinterface.areaOfPipe(diameter), discharge));
		System.out.println("velocity head : ");
		System.out.println(multiinterface.velocityhead(multiinterface.velocity(multiinterface.areaOfPipe(diameter), discharge)));
		System.out.println("Pressure head : ");
		System.out.println(multiinterface.presserhead(pressure));
		System.out.println("Total energy : ");
		System.out.println(multiinterface.totalenergy(multiinterface.presserhead(pressure), 
		multiinterface.velocityhead(multiinterface.velocity(multiinterface.areaOfPipe(diameter), discharge)), height));
	}
}
