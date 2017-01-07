package arrayacollections;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysizebyscan {
	static  Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
			int count=scan.nextInt();
			//array size by scan
		    int[] days= new int[count];
		    //now taking the number of count random numbers
		    //assigning the values in array days
		    for(int i=0;i<count;i++)
		    {
		       days[i]=(int)(Math.random()*100+1);
		     }
		    //converting days values into strings
		    System.out.println(Arrays.toString(days)); 
			}
}
