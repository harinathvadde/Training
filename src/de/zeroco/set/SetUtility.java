package de.zeroco.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUtility {

	/**
	 * This method will used to convert arrays to set list 
	 * @author HARINATH
	 * @since 12/12/2022
	 * @param data
	 * @return set
	 */
	public static Set<Integer> arraysToSetList(Integer[] data){
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(Arrays.asList(data));
		return set;	
	}
	/**
	 * This method used to find union of two interger set inputs
	 * @author HARINATH
	 * @since 12/12/2022
	 * @param dataone
	 * @param datatwo
	 * @return set
	 */
	public static Set<Integer> findUnion(Set<Integer> dataone, Set<Integer> datatwo){
		Set<Integer> unionData = new HashSet<Integer>(dataone);
		unionData.addAll(datatwo);
		return unionData;
	}
	/**
	 * This method is used to find intersection of two interger set inputs
	 * @author HARINATH
	 * @since 12/12/2022
	 * @param dataone
	 * @param datatwo
	 * @return set
	 */
	public static Set<Integer> findIntersection(Set<Integer> dataone, Set<Integer> datatwo){
		Set<Integer> intersectionSet = new HashSet<Integer>(dataone);
		intersectionSet.retainAll(datatwo);
		return intersectionSet;
	}
	/***
	 * This method used to find difference between two interger set inputs
	 * @author HARINATH
	 * @since 12/12/2022
	 * @param dataone
	 * @param datatwo
	 * @return set
	 */
	public static Set<Integer> findDifference(Set<Integer> dataone, Set<Integer> datatwo){
		Set<Integer> differenceData = new HashSet<Integer>(dataone);
		differenceData.removeAll(datatwo);
		return differenceData;
	}
}
