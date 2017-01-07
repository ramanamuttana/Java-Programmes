package arrayacollections;
import java.util.Scanner;

public class ArrayDeclaration {
 static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
    String[] days= new String[112];
       // taking other value
         for(int i=0;i<112;i++)
         {
        	 days[i]=scan.next();
        	 System.out.println(days[i]); 
         }

	}

}
