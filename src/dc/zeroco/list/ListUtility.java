package dc.zeroco.list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.zc.training.WhileAndDoWhile;

import de.zeroco.assignment.Utility;

public class ListUtility {

	/***
	 * This method will used to convert array to list and sorted list
	 * @author HARINATH
	 * @since 08/12/2022
	 * @param data
	 * @return list
	 */
	public static List<String> arrayToList(String[] data) {
		List<String> list = new ArrayList<String>();
		for (String res : data) {
			list.add(res);
		}
		Collections.sort(list);
		return list;
	}
	/**
	 * This metod used to convert list to array
	 * @author HARINATH
	 * @since 08/12/2022
	 * @param data
	 * @return ARRAY
	 */
	public static String[] listToArray(List<String> data) {
		String[] array = data.toArray(new String[data.size()]);
		return array;	
	}
	/**
	 * This method used to change data in list index and get particular index data
	 * @author HARINATH
	 * @since 08/12/2022
	 * @param data
	 * @return
	 */
	public static String getAndSetElements(List<String> data, String newdata){
		return "set method : " + data.set(2, newdata) + "get metod : " + data.get(2);
	}	
	
	/**
	 * This method will read the data from csv file and saved in array list
	 * @author HARINATH
	 * @since 08/12/2022
	 * @param filePath
	 * @return LIST
	 */
	public static List<String> readData(String filePath){
		if (Utility.isBlank(filePath)) return null;
		List<String> data = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = null;
			while ((line = reader.readLine()) != null) 
				data.add(line);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return data;
	}
	/**
	 * This metod will used to find palindrome numbers between given range
	 * @author HARINATH
	 * @since 08/12/2022
	 * @param startValue
	 * @param endValue
	 * @return
	 */
	public static List<Integer> findPalindrome(int startValue, int endValue){
		List<Integer> palinderomeNumbers = new ArrayList<Integer>();
		for (int i = startValue; i <= endValue; i++) {
			if (i == WhileAndDoWhile.reverseNumber(i)) {
				palinderomeNumbers.add(i);
			}
		}
		return palinderomeNumbers;
	}
}
