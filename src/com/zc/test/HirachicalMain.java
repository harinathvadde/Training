package com.zc.test;

import com.zc.inheritance.*;

public class HirachicalMain {

	public static void main(String[] args) {
		
		//creating object for hirachical child one calss one and printing all extended details of single level class
		HirachicalChildOne h = new HirachicalChildOne();
		System.out.println(h.test());
		System.out.println(h.display());
		
		//creating object for hirachical child two calss one and printing all extended details of single level class
		HirachicalChildTwo h1 = new HirachicalChildTwo();
		System.out.println(h1.test());
		System.out.println(h1.print());
	}
}
