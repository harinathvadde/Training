package com.zc.threads;

public class ThreadsString {
	
	public static void main(String argvs[]) { 
	
		RunnableThread rt = new RunnableThread();
		Thread t= new Thread(rt,"My first thread");  
		t.start();  
		String str = t.getName();  
		System.out.println(str);  
	}  
}
