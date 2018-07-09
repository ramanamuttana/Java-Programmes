package decisionlopps;

import java.util.*;

public class Scannerclose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans =null;

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1) {
			ans = "oddNumber ";
		} else if ((n % 2 == 0) && (n > 1 && n <= 5)) {
			ans = "n may be 2 or 4";
		} else if ((n % 2 == 0) && (n > 5 && n <= 20)) {
			ans = "even numbers between 5 and 20";
		} else if ((n % 2 == 0) && (n > 20 && n <= 100)) {
			ans = "even numbers between 20 and 100";
		}
		System.out.println(ans);
	}
}
