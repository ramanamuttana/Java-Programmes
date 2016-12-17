package exceptions;

public class Try_Catch {

	public static void main(String[] args) {
	 int a=5;
	 int b=0;
	 try
	 {
		 int d=a/b;
	 }//here we are mentioning the type of exception 
	 catch(ArithmeticException e)
	 {
		 System.out.println("OOps you cant divide by zero");
	 }

	}

}
