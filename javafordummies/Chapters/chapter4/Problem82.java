package org.chapter4;

import java.io.File;

public class Problem82 {
	
	
	/*
	 * some times when a method is returning some object ,
	 *  if the method doesnot have proper name then it is better to avoid var 
	 * EX: now by looking at bin variable name we can not say what object we are getting 
	 */

	public static void main(String[] args) {
		var bin=fetchBinContent();
		System.out.println(bin);

	}
	
	public static File fetchBinContent() {
		return new File("Demo");
	}

}
