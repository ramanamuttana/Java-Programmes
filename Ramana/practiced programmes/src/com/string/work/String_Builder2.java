package com.string.work;

public class String_Builder2 
{
	String step1="jabed";
	public String_Builder2(String string) {
		// TODO Auto-generated constructor stub
	}
	public static void wrapp(String stem1)
	{
		stem1=stem1+"first candidate";
	}
	public static void wrapp2(StringBuilder sub)
	{
		sub.append("first candidate");
	}
	
	private void append(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args)
	{
		 String s1="jabed";
		 wrapp(s1);
		 System.out.println(s1);
		 StringBuilder sub=new StringBuilder("jabedsirji ");
		 wrapp2(sub);
		 System.out.println(sub);
		 
	}

}
