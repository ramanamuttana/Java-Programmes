package arrayacollections;

import java.util.Arrays;
import java.util.Scanner;

public class Searching_Array_Values {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int luckynumber = 13;
		// int FindValueat=-1;
		int counts = scan.nextInt();
		int[] days = new int[counts];

		for (int i = 0; i < counts; i++) {
			days[i] = (int) (Math.random() * 100 + 1);

		}
		Arrays.sort(days);
		System.out.println(Arrays.toString(days));

		/*
		 * for(int j=0;j<days.length;j++) if(days[j]==luckynumber) { FindValueat=j; }
		 * if( FindValueat>-1) { System.out.println("Found"); }else {
		 * System.out.println("not found"); }
		 */
		int findValueat = Arrays.binarySearch(days, luckynumber);
		/*
		 * 
		 * Position to be found is always at > -1
		 * 
		 */
		if (findValueat > -1) {
			System.out.println("Found");
		} else {
			System.out.println("not found");
		}

	}

}
