package com.string.work;

import java.util.Scanner;

public class String_Buolder {
	static Scanner scan = new Scanner(System.in);

	// changing wach character to
	public static void main(String[] args) {
		System.out.println("enter some string");
		String sub = scan.nextLine();
		StringBuilder sb = new StringBuilder(sub);
		int Vowelcount = 0;
		for (int i = 0; i < sub.length(); i++) {
			char c = sub.charAt(i);
			if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i') || (c == 'O')
					|| (c == 'o') || (c == 'u') || (c == 'U')) {
				Vowelcount++;
			}
			sb.setCharAt(i, '#');
		}
		System.out.println(" There are  " + Vowelcount + " vowels in given sentence");
		System.out.println(sub);
		System.out.println(sb.toString());

		// the output 
		/*
		 * enter some string, the berlin is the capital of germany ,There are 11 vowels in
		 * given sentence, the berlin is the capital of germany,
		 * ######################################
		 */
	}
}
