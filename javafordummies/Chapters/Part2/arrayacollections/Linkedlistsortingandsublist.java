package arrayacollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistsortingandsublist {

	public static void main(String[] args) {
		List<Integer> numbers = new LinkedList<Integer>();
		// adding numbers to linked list
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		// sorting of the given numbers
		Collections.sort(numbers);
		/*
		 * taking sublist of the sorted numbers if the sublist range(o,5)all the numbers
		 * will come , we have to take how many numbers needed, it will always start
		 * with 0 and ends with required numbers
		 */
		List<Integer> order = numbers.subList(0, 3);
		Collections.reverse(order);
		System.out.println(order);
	}
}
