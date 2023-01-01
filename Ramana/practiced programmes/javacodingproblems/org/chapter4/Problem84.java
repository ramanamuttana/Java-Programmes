package org.chapter4;

import java.util.ArrayList;
import java.util.List;

public class Problem84 {

	public static void main(String[] args) {
	var playersData=getPlayer();
	System.out.println("diamond issue");

	}
	
	public static List<Player> getPlayer(){
		
		//var listOfPlayers=new ArrayList<>();
		/*
		 * suppose if we write above code it is also correct but we can not define the inferred
		 * type like String or object.
		 */
		
		Player p1=new Player();
		Player p2=new Player();
		
		/*
		 * dont write 
		 * var listOfPlayers=new ArrayList<>();
		    listOfPlayers.add(p1);
		    listOfPlayers.add(p2);
		 *  here we are simply adding the object thats it 
		 *  return would be list<Object>
		 */
		List<Player> listOfPlayers=new ArrayList<Player>();
		listOfPlayers=List.of(p1,p2);
		return listOfPlayers;
	}
}

class Player{
	
}
