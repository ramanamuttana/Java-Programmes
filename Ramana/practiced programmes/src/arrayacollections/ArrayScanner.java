package arrayacollections;

import java.util.Scanner;

public class ArrayScanner {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// here the maximum number of inputs can be given is 5 only
		String[] input = new String[5];
		for (int i = 0; i < input.length; i++) {
			input[i] = scan.next();
			System.out.println(input[i]);
		}
	}
}
