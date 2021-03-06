package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_With_Scanner_While {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// It takes only integers if we give string we will get mismatch Exception 
		int i = GetValue();
		System.out.println("The Entered value is :" + i);
	}

	public static int GetValue() {
		while (true) {
			try {
				return scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("The value is not an integer");
				scan.next();
			}
			return 0;
		}
	}
}