package com.zc.test;

import com.zc.object.type.casting.*;

public class UpCastingMain {

	public static void main(String[] args) {
		
		UpCastingParent ucp = new UpCastingParent();	//parent class
		System.out.println(ucp.numberone);
		System.out.println(ucp.test());
		
		UpCastingChild ucc = new UpCastingChild();		//Child class
		System.out.println(ucc.numberone);
		System.out.println(ucc.numbertwo);
		System.out.println(ucc.print());
		System.out.println(ucc.test());
		
		UpCastingParent uc = new UpCastingChild();		//Upcasting
		System.out.println(uc.numberone);
		System.out.println(uc.test());
	}
}
