package dc.zeroco.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTesting {

	public static void main(String[] args) {
		
		LinkedList<Object> list = new LinkedList<Object>();
		list.add("Ravi");
		list.add(65365);
		list.add('a');
		list.add(946.56);
		System.out.println(list);
		Iterator<Object> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		list.add(2, "harinath");
		
		LinkedList<String> listone = new LinkedList<String>();
		listone.add("niranjan");
		listone.add("sathis");
		list.addAll(listone);
		System.out.println(list);
		
		LinkedList<Integer> listtwo = new LinkedList<Integer>();
		listtwo.add(659746);
		listtwo.add(213549);
		list.addAll(2, listtwo);
		System.out.println(list);
		
		list.addFirst('w');
		list.addLast(6654.32);
		System.out.println(list);
		
		list.remove(6);
		
		System.out.println(list);
	}
	
}
