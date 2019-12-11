package StringChanges;

import java.util.Scanner;

public class Replace_String {
	
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter some string");
		String sub = scan.nextLine();
		// sub=sub.replaceAll("cat", "dog");
		sub = sub.replaceFirst("vish", "new guy");
		System.out.println(sub);
	}
}
