package arrayacollections;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter the value of n: ");
       int n = s.nextInt();
       int numbers[]=fibonacci(n);
      /* String strlist = System.getenv().get("fibonacci(n)");
       List<String> list = Arrays.asList(strlist.split(","));*/
       List<String> winningCombination=numbers[].subList(2,4);
			//Collections.sort(winningCombination);
			System.out.println(winningCombination);
   }

   public static int[] fibonacci(int n) {
	   if (n == 0) {
           System.out.println("0");
       } else if (n == 1) {
           System.out.println("0 1");
       } else {
           System.out.print("0 1 ");
           int a = 0;
           int b = 1;
           for (int i = 1; i < n; i++) {
               int nextNumber = a + b;
               System.out.print(nextNumber + " ");
               a = b;
               b = nextNumber;
           }
       }
       int[] nextNumber = null;
	return nextNumber;
          }
   }
