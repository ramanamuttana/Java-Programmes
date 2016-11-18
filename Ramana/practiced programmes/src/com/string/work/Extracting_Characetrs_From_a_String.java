package com.string.work;

import java.util.Scanner;

public class Extracting_Characetrs_From_a_String {
    static Scanner scan=new Scanner(System.in);
    
	public static void main(String[] args) {
		System.out.println("enter some string");
		 String sub=scan.nextLine();
		 int Vowelcount=0;
		for(int i=0;i<sub.length();i++)
		{
			char c=sub.charAt(i);
			if((c=='A')||(c=='a')||(c=='E')||(c=='e')||(c=='I')||(c=='i')||(c=='O')||(c=='o')||(c=='u')||(c=='U'))
			{
				Vowelcount++;
			}
		}
		System.out.println(" There are  "+Vowelcount+" vowels in given sentence");
	}
}
