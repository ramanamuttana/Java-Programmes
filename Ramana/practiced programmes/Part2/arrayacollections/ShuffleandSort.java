package arrayacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleandSort {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i <= 5; i++)
			// It will add the elements of from 1 to 5
			numbers.add(i);
		// Collections.shuffle(numbers);
		// It will Keep the collected elements in order especially in Ascending order
		Collections.sort(numbers);
		System.out.println(numbers);
		// Taking sublist of the items i.e (Required Index)
		List<Integer> winningCombination = numbers.subList(1, 4);
		// Collections.sort(winningCombination);
		System.out.println(winningCombination);
	}
}
