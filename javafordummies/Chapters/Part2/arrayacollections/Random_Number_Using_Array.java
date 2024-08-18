package arrayacollections;

import java.util.Scanner;

public class Random_Number_Using_Array {

	static Scanner scan = new Scanner(System.in);

	
	/*
	 * random number generator 
	 * 
	 */
	public static void main(String[] args) {
		int count = scan.nextInt();
		int[] days = new int[count];

		for (int i = 0; i < count; i++) {
			days[i] = (int) (Math.random() * 100 + 1);
			System.out.println(days[i]);
		}
	}
}
