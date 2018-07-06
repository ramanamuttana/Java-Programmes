package arrayacollections;

import java.util.LinkedList;
import java.util.List;

public class Listreturn {
	 private static String[] words= new String[] {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	
	public static void main(String[]args)
	{
		for(int i=10;i<21;i++){
			  semi(i);
		System.out.println(semi(i));
		  }	
	}		
	public static List<Integer> semi(int addingvalue){
	
	List<Integer> summon= new LinkedList<Integer>();
	//adding summon to linked list
	summon.add(1);
	summon.add(2);
	summon.add(3);
	summon.add(4);

	/*int min=10;
	int max=17;
	
	for(int i=min;i<=max;i++)
	{
		summon.add(i);
	}*/
	summon.add(5);
	summon.add(addingvalue);
	
	return summon;
	}

}
