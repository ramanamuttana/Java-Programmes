package tenthchapter.exampleone;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	
	public static void main(String args[ ]) {
		DecimalFormat decFormat=new DecimalFormat();
		decFormat.setMinimumFractionDigits(2); // after . keep only two digits 
		decFormat.setNegativePrefix("("); // before negative value add (
		decFormat.setNegativeSuffix(")"); // after negative value add last )
		System.out.println(decFormat.format(345));
		System.out.println(decFormat.format(-345));
	}
}
