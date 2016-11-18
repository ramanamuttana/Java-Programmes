package Decisionlopps;

public class TryandCatch {

	public static void main(String[] args) 
	{
		int a,b;
		a=5;
		b=0;
		try
		{
			int c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("oops divide by zero is not possible");
		}

	}

}
