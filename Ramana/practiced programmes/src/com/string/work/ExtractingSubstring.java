package com.string.work;

import java.util.Scanner;

public class ExtractingSubstring 
{
	 static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) 
	{
			System.out.println("enter some string");
		    String sub=scan.nextLine();
		    String OriginalString =sub;
				 int Vowelcount=0;
				for(int i=0;i<sub.length();i++)
				{
					char c=sub.charAt(i);
					if((c=='A')||(c=='a')||(c=='E')||(c=='e')||(c=='I')||(c=='i')||(c=='O')||(c=='o')||(c=='u')||(c=='U'))
					{
						Vowelcount++;
						String front=sub.substring(0,i);
						String back=sub.substring(i+1);
						sub=front+"#"+back;
					}
				}
				System.out.println(" There are  "+Vowelcount+" vowels in given sentence");
				System.out.println(OriginalString);
				System.out.println(sub);
			    }
}
