package Decisionlopps;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Try_Catch_with_Scanner {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		int i=Getvalue();
		System.out.println("The entered value is :" +i);
	}
	public static int  Getvalue()
	{
		while(true)
		{
		try
		{
		return sc.nextInt();
		}
		catch(InputMismatchException e)
		{
		System.out.println("oops divide by zero is not possible");
		sc.next();
		}
		return 0;
        }
	}
	
	
}
	