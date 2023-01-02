package dc.zeroco.list;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		
		Vector<Object> vec = new Vector<Object>();
		vec.add("Tiger");
		vec.add(965.26);
		vec.add("Dog");
		vec.add(5462);
		vec.addElement("Rat");
		vec.addElement('g');
		vec.addElement("Deer");
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		if(vec.contains("Dog")) {
			System.out.println("present in index");
		} else {
			System.out.println("not found");
		}
		System.out.println("The first element : " + vec.firstElement());
		System.out.println("The last element : " + vec.lastElement());
		System.out.println(vec.remove(5462));
	}
}
