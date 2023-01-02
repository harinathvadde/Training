package com.zc.test;

import com.zc.threads.*;

public class ThreadsMain {

	public static void main(String[] args) {
		
		TypesOfThreads tpc = new TypesOfThreads();
		tpc.start();
		
		MultiThread mlt = new MultiThread();
		Thread t1 = new Thread(mlt);
		t1.start();
		
		RunnableThread rt = new RunnableThread();
		Thread t3 = new Thread(rt);
		t3.start();
		
		Thread t2 = new Thread(mlt);
		t2.start();
		}
}
