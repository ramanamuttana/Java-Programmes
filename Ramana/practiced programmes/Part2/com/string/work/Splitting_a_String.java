package StringChanges;

import java.util.Scanner;

public class Splitting_a_String {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter some string");
		String sub = scan.nextLine();
		String[] w = sub.split("\\s+");
		for (String semi : w) {
			System.out.println(semi);
		}
	}
}
