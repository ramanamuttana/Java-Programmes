package exceptions;
import java.util.Scanner;

public class Using_whileloop {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)
	{	
				
		int i=Getvalue();
		System.out.println("The entered value is :" +i);
	}
	public static int  Getvalue()
	{
		//while nothing is there print System.out.println
		//if value is there return the value as sc.nextInt()
		while(!sc.hasNextInt())
	{
		sc.nextLine();
		System.out.println("enterd value is not correct");
	}
		return sc.nextInt();
    }
	}
