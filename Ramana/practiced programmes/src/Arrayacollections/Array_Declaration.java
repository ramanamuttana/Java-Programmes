package Arrayacollections;
import java.util.Scanner;

public class Array_Declaration {
 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
    String[] days= new String[11];
       // taking other value
         for(int i=0;i<11;i++)
         {
        	 days[i]=scan.next();
        	 System.out.println(days[i]); 
         }

	}

}
