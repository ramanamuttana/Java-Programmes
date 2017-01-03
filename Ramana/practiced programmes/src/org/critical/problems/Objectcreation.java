package org.critical.problems;

public class Objectcreation {
	
	public Objectcreation()
	{
		System.out.println("Hello ");
	}
	
	//first time it will execute when main method started 
	static Objectcreation obj=new  Objectcreation();

	public static void main(String[] args) 
	{
     Objectcreation obj=new  Objectcreation();
	}

}
