package com.zc.util;

public class WrapperClass {
	
	/**
	 * This method will return the converted primitive type into String type
	 * @param intValue
	 * @param input
	 * @param doubleValue
	 * @return
	 */
	public static String primitiveTypeToStringType(int intValue,boolean input, double doubleValue) {
		String res = null;
		res = Integer.toString(intValue) + " , ";
		res += String.valueOf(input) + " , ";
		return res += String.valueOf(doubleValue);	
	}
	
	/**
	 * This method returns the converted int value from string type
	 * @param number
	 * @return
	 */
	public static int stringTypeToPrimitiveType(String number) {
		return Integer.parseInt(number); 
	}
	
	public static void main(String[] args) {
		
		//premitive data types
		int intNum = 20; 
		byte byteNum = 10;
		short shortNum = 30;
		long longNum = 40;
		float floatNum = 50.5f;
		double dblNum = 60.5;
		char chrtype = 'd';
		boolean blnType = true;
		
		//Autoboxing: Converting primtive into objects
		Integer objInt = intNum	;
		Byte objByte = byteNum;
		Short objShort = shortNum;
		Long objLong = longNum;
		Float objFloat = floatNum;
		Double objDouble = dblNum;
		Character objChar = chrtype;
		Boolean objBln = blnType;
		
		//printing converted Objects
		System.out.println(objInt);
		System.out.println(objByte);
		System.out.println(objShort);
		System.out.println(objLong);
		System.out.println(objFloat);
		System.out.println(objDouble);
		System.out.println(objChar);
		System.out.println(objBln);
		
		//Unboxing: Converting Objects to Primitives
		byte byteValue = objByte;
		short shortValue = objShort;
		int intValue = objInt; 
		long longValue = objLong;
		float floatValue = objFloat;
		double doubleValue = objDouble;
		char charValue = objChar;
		boolean boolValue = objBln;
		
		//Printing converted primitive vales
		System.out.println("Printing primitive values");
		System.out.println(byteValue);
		System.out.println(shortValue);
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(floatValue);
		System.out.println(doubleValue);
		System.out.println(charValue);
		System.out.println(boolValue);
		
		System.out.println(primitiveTypeToStringType(456875, false, 650.54));
		System.out.println(stringTypeToPrimitiveType("548654"));
	}
}
