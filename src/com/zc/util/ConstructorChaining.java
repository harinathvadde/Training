package com.zc.util;

public class ConstructorChaining {

	int numberone;
	int numbertwo;
	int numberthree;
	int numberfour;
	
	
	public ConstructorChaining() {
		super();
		System.out.println("no argument consttuctor");
	}
	public ConstructorChaining(int numberone) {
		this();
		this.numberone = numberone;
	}
	public ConstructorChaining(int numberone, int numbertwo) {
		this(numberone);
		this.numberone = numberone;
		this.numbertwo = numbertwo;
	}
	public ConstructorChaining(int numberone, int numbertwo, int numberthree) {
		this(numberone,numbertwo);
		this.numberone = numberone;
		this.numbertwo = numbertwo;
		this.numberthree = numberthree;
	}
	public ConstructorChaining(int numberone, int numbertwo, int numberthree, int numberfour) {
		this(numberone,numbertwo,numberthree);
		this.numberone = numberone;
		this.numbertwo = numbertwo;
		this.numberthree = numberthree;
		this.numberfour = numberfour;
	}
	
	public void disply() {
		System.out.println("Number one value : " + numberone);
		System.out.println("Number two value : " + numbertwo);
		System.out.println("Number three value : " + numberthree);
		System.out.println("Number four value : " + numberfour);
	}
}
