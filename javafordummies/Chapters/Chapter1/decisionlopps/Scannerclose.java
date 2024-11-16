package decisionlopps;

import java.util.*;

public class Scannerclose {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close(); // close the scan 
		String ans =null;

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1) {
			ans = "oddNumber ";
		} else if ((n % 2 == 0) && (n > 1 && n <= 5)) {
			ans = "n may be 2 or 4";
		} else if ((n % 2 == 0) && (n > 5 && n <= 20)) {
			ans = "this must be a even number in  between 5 and 20";
		} else if ((n % 2 == 0) && (n > 20 && n <= 100)) {
			ans = "this must be a even number in between 20 and 100";
		}
		System.out.println(ans);
	}

	// Use try-with-resources to handle Scanner closure automatically
      /*  try (Scanner scan = new Scanner(System.in)) {
        *    System.out.print("Enter a number: ");
         *   int n = scan.nextInt();
        *
        *     // Determine the category of the number
        *      if (n % 2 == 1) {
        *             ans = "oddNumber";
        *        } else if (n >= 2 && n <= 5) {
       *           ans = "n may be 2 or 4";
        *      } else if (n >= 6 && n <= 20) {
       *         ans = "this must be an even number between 5 and 20";
        *    } else if (n > 20 && n <= 100) {
        *       ans = "this must be an even number between 20 and 100";
        *  } else {
         *     ans = "number is outside the expected range";
        *}
        *}
*/

}
