package com.zc.test;

import com.zc.abstraction.FoodApp;

public class Hotel extends Thread {

	public static void main(String[] args) {

		int idly = 1;
		int dosa = 2;
		int poori = 3;
		int noofplats = 2;

		FoodApp fdapp = new FoodApp();
		System.out.println(fdapp.order(idly, noofplats));
		System.out.println(fdapp.order(dosa, noofplats));
		System.out.println(fdapp.order(poori, noofplats));
	}
}