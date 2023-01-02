package de.zeroco.set;

import java.util.HashSet;
import java.util.Set;

public class SetTesting {

	public static void main(String[] args) {
		
		Integer[] inputOne = {22, 45,33, 66, 55, 34, 77};
		Integer[] inputTwo = {33, 2, 83, 45, 3, 12, 55};
		
		Set<Object> data = new HashSet<Object>() ;
		data.add("harinath");
		data.add(9652);
		data.add("harinath");
		data.add(6);
		data.add('y');
		data.add(6);
		System.out.println(data);
		for (Object object : data) {
			System.out.println(object);
		}
		System.out.println(SetUtility.arraysToSetList(inputOne));
		System.out.println("union of set1 and set2");
		System.out.println(SetUtility.findUnion(SetUtility.arraysToSetList(inputOne), SetUtility.arraysToSetList(inputTwo)));
		System.out.println("intersection of set1 and set2");
		System.out.println(SetUtility.findIntersection(SetUtility.arraysToSetList(inputOne), SetUtility.arraysToSetList(inputTwo)));
		System.out.println("differance of set1 and set2");
		System.out.println(SetUtility.findDifference(SetUtility.arraysToSetList(inputOne), SetUtility.arraysToSetList(inputTwo)));
	}
}
