package com.zc.threads;

public class MultiThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 4; i++) {
			System.out.println(Thread.currentThread() + " " + i);
		} 
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
