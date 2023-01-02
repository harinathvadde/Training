package com.zc.training;

public class OuterClass {

		public String print() {
			return " This is out class ";
		}
	/**
	 * classes are classified into two types 
	 * @author HARINATH
	 *
	 */
	public class InnerClass {
		
		public String disply() {
			return " This is inner class ";
		}
	}
	public static void main(String[] args) {
		
		//creating object or outer class
		OuterClass oc = new OuterClass();
		
		//creating object for inner class 
		OuterClass.InnerClass ic = oc.new InnerClass();
		
		System.out.println(oc.print());
		System.out.println(ic.disply());
	}
}
