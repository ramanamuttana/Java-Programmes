package org.player;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	
	public static void main(String args[ ]) {
		DecimalFormat decFormat=new DecimalFormat();
		decFormat.setMinimumFractionDigits(2);
		decFormat.setNegativePrefix("(");
		decFormat.setNegativeSuffix(")");
		System.out.println(decFormat.format(345));
		System.out.println(decFormat.format(-345));
	}
}
