package com.zc.inheritance;

public class MultiLevel extends SingleLevelChild {

	String location  = "tirupati";
	int experience = 1;
	
	public String disply() {
		return name + " , " + sal + " , " + age + " , " + id + " , " + location + " and " + experience + "year";
	}
}
