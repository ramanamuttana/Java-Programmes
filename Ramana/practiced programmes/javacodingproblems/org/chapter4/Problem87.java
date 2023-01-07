package org.chapter4;

import java.util.ArrayDeque;
import java.util.Stack;

public class Problem87 {

	public static void main(String[] args) {
		stackExample();
		arrayDeque();
	}

	//FIFO
	public static void stackExample() {
		var stack = new Stack<String>();
		stack.push("John");
		stack.push("Martin");
		stack.push("Anghel");
		stack.push("Christian");

		stack.forEach(System.out::println);
	}
	
	// last in first out 

	public static void arrayDeque() {
		var stack = new ArrayDeque<String>();
		stack.push("John");
		stack.push("Martin");
		stack.push("Anghel");
		stack.push("Christian");

		stack.forEach(System.out::println);
	}
}
