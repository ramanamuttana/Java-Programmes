package arrayacollections;

import java.util.Arrays;

public class Array_Comparison {
	
	static String weekend="Sunday";

	public static void main(String[] args) {

		// Comparing arrays having Strings
		String[] days = new String[3];
		days[0] = "Sunday";
		days[1] = "monday";
		days[2] = "tuesday";
		String[] day = new String[4];
		day[0] = "Sunday";
		day[1] = "monday";
		day[2] = "tuesday";
		day[3] = "wednesday";
		
		String[] oftenday = new String[1];
		oftenday[0] = "Sunday";

		// comparision of values 
		if (Arrays.equals(days, day)) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
		/**
		 * only values are compared not String variable and Object 
		 */
		
		if (oftenday[0]==weekend) {
			System.out.println("They are equal");
		} else {
			System.out.println("They are not equal");
		}
		
	}
}

/*
 * package org.example; public class Main {
 *  public static void main(String[] args) { 
 *  String str1="Test"; 
 *  String str2=new String("Test");
 * System.out.println(str1==str2); // false
 * System.out.println(str1.equals(str2)); // true } }
 */
