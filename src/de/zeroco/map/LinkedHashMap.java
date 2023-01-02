package de.zeroco.map;

import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new java.util.LinkedHashMap<String, Integer>();
		map.put("harinath", 1);
		map.put("rajesh", 8);
		map.put("naveen", 5);
		System.out.println(map);
		for (Map.Entry<String, Integer> output : map.entrySet()) {
			System.out.println(output);
		}
	}
}
