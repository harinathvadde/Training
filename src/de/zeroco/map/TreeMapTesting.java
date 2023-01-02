package de.zeroco.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTesting {

	public static void main(String[] args) {
		
		Map<String, Double> map = new TreeMap<String, Double>();
		map.put("harinath", 98.5);
		map.put("siva", 78.65);
		map.put("raju", 80.5);
		map.put("anjith", 60.5);
		System.out.println(map);
		for (Map.Entry<String, Double> output : map.entrySet()) {
			System.out.println(output);
		}
		
		Map<String, Double> maptwo = new TreeMap<String, Double>();
		maptwo.put("balaji", 55.6);
		maptwo.put("sathish", 63.2);
		map.put("dinesh", 70.5);
		
		map.putAll(maptwo);
		System.out.println(map);
		map.put("siva", 90.5);
		System.out.println(map);
		map.remove("raju");
		System.out.println(map);
		if (map.containsKey("anjith")) {
			System.out.println("marks are : " + map.get("anjith"));
		}
		map.putIfAbsent("ashok", 80.5);
		System.out.println(map);
		System.out.println();
	}
}
