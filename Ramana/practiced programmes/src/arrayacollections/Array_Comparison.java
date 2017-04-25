package arrayacollections;
import java.util.Arrays;

public class Array_Comparison {
	
			public static void main(String[] args) 
			{
		    String[] days= new String[3];
		    days[0]="Sunday";
		    days[1]="monday";
		    days[2]="tuesday";
		    String[] day= new String[3];
		    day[0]="Sunday";
		    day[1]="monday";
		    day[2]="tuesday";
		    if(Arrays.equals(days, day))
		    {
		         System.out.println("They are equal jabed"); 
		     }else
		     {
		    	 System.out.println("They are not equal"); 
		     }
			}
}
