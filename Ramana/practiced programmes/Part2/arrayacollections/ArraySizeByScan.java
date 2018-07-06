package arrayacollections;

import java.util.Scanner;

public class ArraySizeByScan {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int value = scan.nextInt();
		int[] data = new int[value];
		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextInt();
			System.out.println(data[i]);
		}
	}
}
