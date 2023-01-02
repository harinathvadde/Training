package de.zeroco.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapUtility {

	/**
	 * This metod used to convert map to list
	 * @author HARINATH
	 * @since 13/12/2022
	 * @param map
	 * @return
	 */
	public static List<Object> mapToList(Map<Integer, String> map){
		List<Object> keyList = new ArrayList<Object>(map.keySet());
		List<Object> valueList = new ArrayList<Object>(map.values());
		keyList.addAll(valueList);
		return keyList ;
	}
	
	
}
