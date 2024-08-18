package arrayacollections;

import java.util.Scanner;

public class ArrayScanner {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// declaring the Array size
		String[] input = new String[5];

		for (int i = 0; i < input.length; i++) {
			input[i] = scan.next();
			System.out.println(input[i]);
		}
	}
}
