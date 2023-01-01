package org.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Problem83 {
	
	
	/*
	 *  it is advasiable to avoid var for List because it is interface implmentation 
	 * mostly var will locate within the method then , 
	 * this would cause problems incase if something chanages at global level 
	 */

	public static void main(String[] args) {
		var data=getData();
		System.out.println(data);

	}
	
	/*
	 * it is advasiable to avoid Arraylist,
	 *  ArrayList<String> players=new ArrayList<String>(); not recommended
	 *  List<String> players=new ArrayList<String>(); recemmonded
	 */
	public static List<String> getData() {
		 List<String> players=new ArrayList<String>();
		 players.add("sam");
		 return players;
	}

}
