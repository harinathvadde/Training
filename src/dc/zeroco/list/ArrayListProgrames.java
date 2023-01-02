package dc.zeroco.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import de.zeroco.files.FilesUtility;

public class ArrayListProgrames {
	
	public static void main(String[] args) {
		
		String filePath = "G:\\student1.csv";
		String data[] = new String[] {"java","python","c++"};
		
		List<String> list = new ArrayList<String>();
		list.add("hari");
		list.add("rajesh");
		list.add("sathish");
		list.add("prashanth");
		System.out.println(list);
		for (String names : list) {
			System.out.println(names);
		}
		
		ArrayList<Object> al = new ArrayList<Object>(); 
		al.add(10);
		al.add("harinath");
		al.add('a');
		al.add(15.65);
		for (Object output : al) {
			System.out.println(output);
		}
		al.remove(0);
		System.out.println(al);
		
		System.out.println(ListUtility.arrayToList(data));
		System.out.println(Arrays.toString(ListUtility.listToArray(list)));
		System.out.println(ListUtility.getAndSetElements(list, "niranjan"));
		System.out.println(FilesUtility.fileAppend(filePath, list.toString()));
		System.out.println(ListUtility.readData(filePath));
		System.out.println(ListUtility.findPalindrome(10, 100));
		System.out.println(FilesUtility.fileAppend(filePath, ListUtility.findPalindrome(11, 100).toString()));
	}
}
