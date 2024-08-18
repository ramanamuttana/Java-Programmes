package arrayacollections;

import java.util.LinkedList;

public class Linkedlist_1_Polymorphism {
	
	public static void main(String[] args) {
		Linkedlist_1_Polymorphism dp=new Linkedlist_1_Polymorphism();
		dp.linkedarray();
	}

	/*
	 * we are also adding the different methods for the add method 
	 */
	public void linkedarray() {
		LinkedList<String> officers = new LinkedList<String>();
		officers.add("ram");
		officers.add("ana");
		officers.add(0, "muttana");
		officers.add("veta");
		officers.add("reddy");
		for (String S : officers)
			System.out.println(S);

	}
}
