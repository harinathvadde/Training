package de.zeroco.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTesting {

	public static void main(String[] args) {
		
		Set<String> input = new TreeSet<String>();
		input.add("harinath");
		input.add("ajay");
		input.add("ravi");
		input.add("bhanu");
		input.add("vijay");
		System.out.println(input);
		Iterator<String> itr = input.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
