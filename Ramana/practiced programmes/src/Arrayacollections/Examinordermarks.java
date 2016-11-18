package Arrayacollections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Examinordermarks {

	public static void main(String[] args) {
		List<Integer> numbers= new LinkedList<Integer>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(4);
		numbers.add(1);
		numbers.add(3);
		Collections.sort(numbers);
		List<Integer> order= numbers.subList(0,5);
			Collections.reverse(order);
			System.out.println(order);

	}

}
