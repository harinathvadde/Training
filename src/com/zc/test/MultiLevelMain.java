package com.zc.test;

import com.zc.inheritance.*;

public class MultiLevelMain {

	public static void main(String[] args) {
		
		MultiLevel m = new MultiLevel();
		System.out.println(m.test());
		System.out.println(m.print());
		System.out.println(m.disply());
	}
}
