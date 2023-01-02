package de.zeroco.assignment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import de.zeroco.files.FilesUtility;

public class AssignmentUtility {

	public final static String SOURCE = "G:\\lisence.json";
	public final static int MIN_IN_MILLIS = 60000;
	public final static String[] ONES = new String[] {"","one","two","three","four","five","six","seven","eight","nine",
			"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"}; 
	public final static String[] TENS = new String[] {"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	public final static String[] POWER_OF_TENS = new String[] {"hundred", "thousand","lakh","crore"};
	/**
	 * This mehod used to extrac json file data to string
	 * @author HARINATH
	 * @since 13/12/2022
	 * @param filePath
	 * @return String
	 * @throws IOException
	 */
	public static String getData(String filePath) {
		if (Utility.isBlank(filePath)) return "";
		String data = null;
		try {
			data = new String(Files.readAllBytes(Paths.get(filePath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}
	/**
	 * This method used to check directory is available or not if not avilable it will create directory
	 * @author HARINATH
	 * @since 13/12/2022
	 * @param filePath
	 * @return
	 */
	public static String getDirectory(String filePath) {
		if (Utility.isBlank(filePath)) return null;
		File file = new File(filePath);
		try {
			if (file.exists()) {
				if (file.isDirectory()) {
					return filePath;
				}
			}
			file.mkdir();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filePath;
	}
	/**
	 * This method is used to generate lisence by client name between range from and to in the destination
	 * @author HARINATH
	 * @since 13/12/2022
	 * @param client
	 * @param from
	 * @param to
	 * @param desti
	 * @return
	 */
	public static String generateLisence(String client, int from, int to, String desti) {
		if (Utility.isBlank(client) || Utility.isBlank(from) || Utility.isBlank(to) || Utility.isBlank(desti)) return null;
		for (int i = from; i <= to; i++) {
			String num = String.format("%02d", i);
			FilesUtility.fileWrite(getDirectory(desti) +File.separator + client + num + ".zc_lic", 
					getData(SOURCE).replaceAll("\\$no\\$", client + num));
		}
		return to + " Lisences Files Generated Successfully..!!";
	} 
	/**
	 * This method is used to add min to given date and return date as output
	 * @author HARINATH
	 * @since 16/12/2022
	 * @param min
	 * @param ipDate
	 * @return Date
	 */
	public static Date addMinToTime(int min, Date ipDate) {
		if (Utility.isBlank(min)) return null; 
		return new Date(ipDate.getTime() + (min * MIN_IN_MILLIS));
	}
	/**
	 * This method is used to substract min to given date and return date as output
	 * @author HARINATH
	 * @since 16/12/2022
	 * @param min
	 * @param ipDate
	 * @return Date
	 */
	public static Date subMinToTime(int min, Date ipDate) {
		if (Utility.isBlank(min)) return null; 
		return new Date(ipDate.getTime() - (min * MIN_IN_MILLIS));
	}
	/**
	 * This method used to add days, months, years to given date input and return the date as given formate
	 * @author HRINATH
	 * @since 16/12/2022
	 * @param date
	 * @param format
	 * @param durationType
	 * @param duration
	 * @return String formated date
	 */
	public static String addDurationToDate(Date date, String format, String durationType, int duration) {
		if (Utility.isBlank(format) || Utility.isBlank(durationType) || Utility.isBlank(duration)) return ""; 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
		LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault() );
		if (durationType.equalsIgnoreCase("days")) {
			return ldt.plusDays(duration).format(dtf);
		} else if (durationType.equalsIgnoreCase("months")) {
			return ldt.plusMonths(duration).format(dtf);
		} else if (durationType.equalsIgnoreCase("years")) {
			return ldt.plusYears(duration).format(dtf);
		} else {
		return "Entre Correction durationType [days,months,years]";
		}
	}
	/**
	 * This method is used to substract days, months, years to given date input and return the date as given formate
	 * @param date
	 * @param format
	 * @param durationType
	 * @param duration
	 * @return
	 */
	public static String subDurationToDate(Date date, String format, String durationType, int duration) {
		if (Utility.isBlank(format) || Utility.isBlank(durationType) || Utility.isBlank(duration)) return ""; 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);
		LocalDateTime ldt = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault() );
		if (durationType.equalsIgnoreCase("days")) {
			return ldt.minusDays(duration).format(dtf);
		} else if (durationType.equalsIgnoreCase("months")) {
			return ldt.minusMonths(duration).format(dtf);
		} else if (durationType.equalsIgnoreCase("years")) {
			return ldt.minusYears(duration).format(dtf);
		} else {
			return "Entre Correction durationType [days,months,years]";
		}
	}
	/**
	 * This method is used to comapre two dates and give true or false
	 * @author HARINATH
	 * @since 16/12/2022
	 * @param startDate
	 * @param enDate
	 * @return boolean
	 */
	public static boolean compareDate(Date startDate, Date enDate) {
		return (startDate.compareTo(enDate) == 0)?true:false;
	}
	/**
	 * This methos is used to find day name and month name based on given date
	 * @author HARINATH
	 * @since 16/12/2022
	 * @param ipDate
	 * @return String 
	 */
	public static String getDay(String ipDate) {
		if (Utility.isBlank(ipDate)) return "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dt = null;
		Format weekName = new SimpleDateFormat("EEEE/MMMM");
		try {
			dt = sdf.parse(ipDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return weekName.format(dt);
	}

	/**
	 * This method will used to find difference between two given String dates in years ,in months, in days, in hours, in minutes,and in sec.
	 * @author HARINATH
	 * @since 15/12/2022
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static String findDifference(String startDate, String endDate) {
		if (Utility.isBlank(startDate) || Utility.isBlank(endDate)) return "";
		long diffInTime = Utility.stringToDate(endDate).getTime() - Utility.stringToDate(startDate).getTime();
		return diffInTime /(1000 * 60 * 60 * 24) + " days ";
	}
	/**
	 * This method is used to substract days from given date and return date
	 * @author HARINATH
	 * @since 16/12/2022
	 * @param date
	 * @param days
	 * @return Date
	 */
	public static Date subDays(String date, int days){
		if(Utility.isBlank(date) || Utility.isBlank(days)) return Utility.stringToDate(date);
		return new Date(Utility.stringToDate(date).getTime() - (days * (1000 * 60 * 60 * 24)));
	}
	/**
	 * This method is used to convert entered number value into number in words
	 * @author HARINATH
	 * @since 19/12/2022
	 * @param number
	 * @return String 
	 */
	public static String numberInWords(int number) {
		if (Utility.isBlank(number)) return "";
		String res = "";
		int count = 0;
		int temp = number;
		while (temp != 0) {
			temp /= 10;
			count ++;
		}
		if (count > 0 && number < 20) {
			res = ONES[number];
		} else if(count == 2) {
			res = TENS[number / 10] + " " + ONES[number % 10];
		} else if(count == 3) {
			res =  ONES[number / 100] + " " + POWER_OF_TENS[0] + ((number % 100 != 0)? "":"") + " " + numberInWords(number % 100); 
		} else if (count == 4) {
			res = ONES[number / 1000] + " " + POWER_OF_TENS[1] + ((number % 1000 != 0)? "":"") + " " +numberInWords(number %1000);
		} else if (count == 5) {
			res = numberInWords(number / 1000) + " " + POWER_OF_TENS[1] + " " + numberInWords(number % 1000);
		} else if (count == 6) {
			res = numberInWords(number / 100000) + " " + POWER_OF_TENS[2] + " " + numberInWords(number % 100000);
		} else if (count == 7) {
			res = numberInWords(number / 100000) + " " + POWER_OF_TENS[2] + " " + numberInWords(number % 100000);
		} else if (count == 8) {
			res = numberInWords(number / 10000000) + " " + POWER_OF_TENS[3] + " " + numberInWords(number % 10000000);
		} else if (count == 9) {
			res = numberInWords(number / 10000000) + " " + POWER_OF_TENS[3] + " " + numberInWords(number % 10000000);
		} 
		return res; 
	}
	/**
	 * This method is used to convert number into indian rupee digit formate
	 * @author HARINATH
	 * @since 19/12/2022
	 * @param amount
	 * @return String
	 */
	public static String getIndianFormat(int amount) {
		if (Utility.isBlank(amount)) return "";
		String res = null;
		int temp = amount;
		int count = 0;
		while (temp != 0) {
			temp /= 10;
			count ++;
		} 
		if (count >0 && count < 4) {
			res = amount+"";
		} else if (count == 4) {
			res = (amount / 1000) + ","+ ((amount % 1000 != 0)? "":"") + (amount % 1000);
		} else if (count == 5) {
			res = (amount / 1000) + "," +(amount % 1000);
		} else if (count == 6) {
			res = (amount / 100000) + "," + getIndianFormat(amount % 100000);
		} else if (count == 7) {
			res = (amount / 100000) + "," + getIndianFormat(amount % 100000);
		} else if (count == 8) {
			res = (amount / 10000000) + "," + getIndianFormat(amount % 10000000);
		} else if (count == 9) {
			res = (amount / 10000000) + "," + getIndianFormat(amount % 10000000);
		}
		return res; 
	}
	public static void main(String[] args) {
		
		int amount = 9878;
		
		//System.out.println("before : " + new Date() + " After : " + addMinToTime(10, new Date()));
		//System.out.println("before : " + new Date() + " After : " + subMinToTime(10, new Date()));
		//System.out.println("Before : " + new Date() + " After : " +  addDurationToDate(new Date(), "dd/MM/yy", "months", 40));
		//System.out.println("Before : " + new Date() + " After : " +  subDurationToDate(new Date(), "dd/MM/yy", "days", 10));
		//System.out.println(compareDate(new Date(), new Date(2019-1900, 11, 05) ));
		//System.out.println(findDifference("16/12/2022", "16/12/2026"));
		//System.out.println(subDays("02/01/2022", 0));
		System.out.println("Amount : \nin value Rs." + getIndianFormat(amount) + "/- \nin words : " + numberInWords(amount));
	}
		
}
