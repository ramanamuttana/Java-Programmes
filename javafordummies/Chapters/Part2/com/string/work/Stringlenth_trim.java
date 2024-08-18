package com.string.work;

public class Stringlenth_trim {

	public static void main(String[] args) {
		String s="  hi how are u ";
		int len=s.length();
		System.out.println(len);
		s=s.trim();
		int length=s.length();
		System.out.println(s);
		System.out.println(length);

	}

}
