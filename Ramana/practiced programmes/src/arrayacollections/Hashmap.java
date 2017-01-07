package arrayacollections;

import java.util.HashMap;
import java.util.Map;


public class Hashmap {

	public static void main(String[] args) {
		Map<Integer,Integer> Count= new HashMap<Integer,Integer>();
		Count.put(1000,new Integer(4));
		Count.put(1002,new Integer(3));
		Count.put(1001,new Integer(1));
		Count.put(1003,new Integer(5));
		Count.put(1004,new Integer(2));
		//System.out.println(Count);
		for(Map.Entry<Integer, Integer> entry :Count.entrySet())
		{
			Integer Key =entry.getKey();
		 Integer vampire=entry.getValue();
		 System.out.println(Key+" "+vampire);
		 
		}

	}

}
