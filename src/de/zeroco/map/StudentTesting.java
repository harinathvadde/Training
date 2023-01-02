package de.zeroco.map;

import java.util.HashMap;
import java.util.Map;

public class StudentTesting {
	
	public static void main(String[] args) {
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, new Student(12025, "harinath", 9652754858l, 65.87));
		map.put(2, new Student(12034, "naveen", 9564235756l, 78.35));
		map.put(3, new Student(12050, "dinesh", 7895478962l, 60.5));
		for (Map.Entry<Integer, Student> output : map.entrySet()) {
			System.out.println(output.getKey() + " Details");
			System.out.println(output.getValue().toString());
		}
	}
}
