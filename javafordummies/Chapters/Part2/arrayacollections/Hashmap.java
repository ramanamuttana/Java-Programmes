package arrayacollections;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	/*
	 * change the order based on the value pair ( pending)
	 * 
	 */

	public static void main(String[] args) {
		voidhashMapCalculation();
	}

	public static void voidhashMapCalculation() {

        //hashmap declaration
		Map<Integer, Integer> countValues = new HashMap<Integer, Integer>();
		countValues.put(1000, 4);
		countValues.put(1002, 3);
		countValues.put(1001, 1);
		countValues.put(1003, 5);
		countValues.put(1004, 2);
            // simplified version 
	     /*  Map<Integer, Integer> countValues = Map.of(
              *1000, 4,
              *1002, 3,
              *1001, 1,
              *1003, 5,
             *1004, 2);
		*/
		// System.out.println(Count);
		// using enhanced for loop and getting the keys and values
		for (Map.Entry<Integer, Integer> entry : countValues.entrySet()) {
			Integer Key = entry.getKey();
			Integer valuePair = entry.getValue();
			System.out.println(Key + "  " + valuePair);
		}
	}
}

