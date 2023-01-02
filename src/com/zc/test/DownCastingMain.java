package com.zc.test;

import com.zc.object.type.casting.*;

public class DownCastingMain {

	public static void main(String[] args) {
		
		DownCastinngParent dcp = new DownCastingChild();
		DownCastingChild dcc = (DownCastingChild)dcp;
		System.out.println(dcc.name);
		System.out.println(dcc.age);
		System.out.println(dcc.sal);
		System.out.println(dcc.mobno);
		System.out.println(dcc.display());
		System.out.println(dcc.disply());
	}
}
