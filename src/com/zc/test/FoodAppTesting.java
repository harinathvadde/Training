package com.zc.test;

import com.zc.threads.FoodApp;

public class FoodAppTesting {

	public static void main(String[] args) {
		
		FoodApp fd = new FoodApp();
		Thread t = new Thread(fd);
		t.start();
	}
}
