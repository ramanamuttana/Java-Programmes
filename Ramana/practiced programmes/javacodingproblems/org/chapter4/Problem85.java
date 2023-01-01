package org.chapter4;

public class Problem85 {

	public static void main(String[] args) {
	/*
	 *  for an Array initialization declaring  the variables at runtime will not work 
	 *  for Ex: var numbers ={1,3,4} now we dont know what kind of inferred is this .
	 *  whether those are integers ,or double 
	 */
		var numbers=new int[10];
		numbers[0]=1;
		System.out.println(numbers[0]);

	}

}
