package com.zc.interfacee;

public class SingleLevelClass implements SingleLevelInterfaceChaild{

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
	public double velocityhead(double velocity) {
		double velocityhead = Math.pow(velocity, 2) / (2 * 9.8);
		return velocityhead;
	}
}
