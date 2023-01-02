package de.zeroco.map;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTesting {

	public static void main(String[] args) {
		
		Map<Integer, Employee> map = new TreeMap<Integer, Employee>();
		map.put(2025, new Employee("abc@123", "harinath", 3, 20000));
		map.put(2029, new Employee("abc@134", "ranjith", 1, 10000));
		map.put(2015, new Employee("abc@123", "anjith", 5, 40000));
		System.out.println(map);
		for (Map.Entry<Integer, Employee> op : map.entrySet()) {
			System.out.println(op);
		}
	}
}
