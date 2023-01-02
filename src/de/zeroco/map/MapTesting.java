package de.zeroco.map;

import java.util.HashMap;
import java.util.Map;

public class MapTesting {

	public static void main(String[] args) {
		
		Map<Integer, String> input = new HashMap<Integer, String>();
		input.put(205, "harinath");
		input.put(106, "sathish");
		input.put(95, "ravi");
		input.put(154, "ajay");
		System.out.println(input);
		for(Map.Entry<Integer, String> data : input.entrySet()) {
			System.out.println(data.getKey() + " " + data.getValue());
		}
		System.out.println(MapUtility.mapToList(input));
	}
}
