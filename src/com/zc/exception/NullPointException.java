package com.zc.exception;

public class NullPointException {

	public static void main(String[] args) {
		
		String name = null;
		try {
			if(name.equals("Hari")) {
				System.out.println("hello");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			System.out.println("continue with remaining code");
		}	
	}
}
