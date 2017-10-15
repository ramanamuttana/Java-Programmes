package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_with_Scanner {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int i = GetValue();
		System.out.println("The Entered Value is:" + i);
	}

	public static int GetValue() {
		try {
			return scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You enterd value is not an integer");
			scan.next();
			return 0;
		}
	}

}
