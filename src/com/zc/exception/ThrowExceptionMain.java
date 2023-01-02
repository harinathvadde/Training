package com.zc.exception;

import com.zc.exception.ThrowException;

public class ThrowExceptionMain {

	public static void main(String[] args) throws Exception {
		
		double deposite = -10;
		double withdraw = 200;
		
		ThrowException throwexp = new ThrowException();
		System.out.println(throwexp.deposite(deposite));
		System.out.println(throwexp.withdraw(withdraw));
	}
}
