package com.zc.strings;

public class ByNewKeyword {

	public static void main(String[] args) {
		
		//object which is created with using new keyword.
		//string object will be stored in String pool area.
		String name = new String("Harinath");
		String nameone = new String("harinath");
		String nametwo = new String("Harinath");
		
		System.out.println(name.hashCode());
		System.out.println(nameone.hashCode());
		System.out.println(name.equals(nameone));
		System.out.println(name == nameone);
		
		System.out.println(name.equals(nametwo));
		System.out.println(name == nametwo);
	}
}
