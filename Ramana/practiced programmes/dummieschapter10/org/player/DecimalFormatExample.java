package org.player;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	
	public static void main(String args[ ]) {
		DecimalFormat decFormat=new DecimalFormat();
		decFormat.setMinimumFractionDigits(2);
		decFormat.setNegativePrefix("("); // before negative value add (
		decFormat.setNegativeSuffix(")"); // before negative value add last )
		System.out.println(decFormat.format(345));
		System.out.println(decFormat.format(-345));
	}
}
