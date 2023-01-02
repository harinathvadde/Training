package de.zeroco.assignment;

public class StringExtraction {

	public static String findTicketNumber(String data, String start, String end)throws NullPointerException {
		return data.substring(data.indexOf(start)+2, data.indexOf(end));
	}
}
