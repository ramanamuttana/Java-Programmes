package org.simpleProgrammes;

public class CallNonStaticVariable {

	/**
	 * when you call a non static variable into main method it will give an
	 * error, make sure that the variable should contain static
	 */
	// String value ="HelloWorld";
	static String value = "HelloWorld";

	public static void main(String[] args) {
		System.out.println(value);
	}

}
