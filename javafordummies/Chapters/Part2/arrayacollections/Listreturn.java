package arrayacollections;

import java.util.LinkedList;
import java.util.List;


//06/01/2023 check previous version of this file before on this date 
public class Listreturn {

	static List<Integer> data = new LinkedList<Integer>();
	private static String[] words = new String[] { "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten" };

	public static void main(String[] args) {
		addData() ;
		for (int i = 10; i < 21; i++) {
			semi(i);
		}
		for (Integer s : data) {
			System.out.println(s);
		}

	}

	public static void addData() {
		// adding summon to linked list
		data.add(1);
		data.add(2);
		data.add(3);
		data.add(4);

		/*
		 * int min=10; int max=17;
		 * 
		 * for(int i=min;i<=max;i++) { summon.add(i); }
		 */
		data.add(5);

	}

	public static void semi(int addingvalue) {

		data.add(addingvalue);

	}
}
