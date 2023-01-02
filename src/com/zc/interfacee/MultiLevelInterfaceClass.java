package com.zc.interfacee;

public class MultiLevelInterfaceClass implements MultiLevelInterface {

	@Override
	public double velocityhead(double velocity) {
		double velocityhead = Math.pow(velocity, 2) / (2 * 9.8);
		return velocityhead;
	}

	@Override
	public double areaOfPipe(double diameter) {
		double area = (Math.PI*(Math.pow(diameter, 2))/4);
		return area;
	}

	@Override
	public double velocity(double area, double discharge) {
		double velocity = discharge / area;
		return velocity;
	}

	@Override
	public double presserhead(double presser) {
		double presserhead = presser / (0.8*9810);
		return presserhead;
	}

	@Override
	public double totalenergy(double presser, double velocity, double height) {
		double te = presserhead(presser) + velocityhead(velocity) + height;
		return te;
	}
}
