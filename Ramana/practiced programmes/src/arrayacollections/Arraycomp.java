package arrayacollections;

import java.util.Arrays;

public class Arraycomp {

	public static void main(String[] args) {
		
		String[] days=new String[5];
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thrusday";
		
		String[] day=new String[5];
		day[0]="Monday";
		day[1]="Tuesday";
		day[2]="Wednesday";
		day[3]="Thrusday";
		
		if(Arrays.equals(days, day))
		{
			System.out.println("Arrays are equal");
		}else{
			System.out.println("Arrays are  not equal");
		}
	}

}
