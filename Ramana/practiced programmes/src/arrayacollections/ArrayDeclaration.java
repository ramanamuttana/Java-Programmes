package arrayacollections;
import java.util.Scanner;

public class ArrayDeclaration {
 static Scanner scan=new Scanner(System.in);
public static void main(String[] args) {
	//declaring the size of the array 
    String[] days= new String[112];
    // taking value
         for(int i=0;i<days.length;i++)
         {
        	 days[i]=scan.next();
        	 System.out.println(days[i]); 
         }
         
	}
}
