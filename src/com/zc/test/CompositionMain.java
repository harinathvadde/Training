package com.zc.test;

import com.zc.util.*;

public class CompositionMain {

	public static void main(String[] args) {
		//first person details
		String nameone = "Harinath";
		String rollnoone = "1219117454";
		String genderone = "Male";
		Long monbileone = 9652754858l;
		int teluguone = 65;
		int hindione = 40;;
		int englishone = 60;
		int mathsone = 90;
		int scienceone = 70;
		int socialone = 60;
		
		//second person details
		String nametwo = "Tej Kiran";
		String rollnotwo = "12196598956";
		String gendertwo = "Male";
		Long monbiletwo = 8965986523l;
		int telugutwo = 98;
		int hinditwo = 68;
		int englishtwo = 36;
		int mathstwo = 87;
		int sciencetwo = 96;
		int socialtwo = 45;
	
		Subject sub = new Subject(teluguone, hindione, englishone, mathsone, scienceone, socialone);
		PersonDetails person = new PersonDetails(nameone, rollnoone, genderone, socialone, sub);
		person.display();
		System.out.println("******************************************");
		Subject subtwo = new Subject(telugutwo, hinditwo, englishtwo, mathstwo, sciencetwo, socialtwo);
		PersonDetails persontwo = new PersonDetails(nametwo, rollnotwo, gendertwo, monbiletwo, subtwo);
		persontwo.display();
	}
}
