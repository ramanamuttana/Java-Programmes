package Decisionlopps;
import java.util.Scanner;
import java.util.Stack;

public class Try_Catch_With_Whileloop {		
		static Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args) 
		{
			
			int i=Getvalue();
			System.out.println("The entered value is :" +i);
		}
		public static int  Getvalue()
		{
			while(!sc.hasNextInt())
			{
			sc.nextLine();
			System.out.println("oops divide by zero is not possible");
			}
			return sc.nextInt();
	        }

}
