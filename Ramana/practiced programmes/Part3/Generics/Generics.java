package Generics;
import java.util.*;

public class Generics<E> {
	/*
	 *  when the class is taking E then list also  does not know what kind of type 
	 *  the Class is taking so it aslo like class accepts E item 
	 */
	
	private LinkedList<E> list=new LinkedList<E> ();
	
	E item;
	public void push(E item)
	{
		list.addFirst(item);
	}
	// delete all the items 
	public E pop(E item)
	{
	   return list.poll();
	}
	// bring the top most item 
	public E peek()
	{
		  return list.peek();
	}
	public int size()
	{
		return list.size();
	}
	public boolean hasItems()
	{
		return !list.isEmpty();
	}

	/* public static void main(String args[]) {
	  /  Generics<Integer> ge=new Generics<>();
	  /  ge.push(2);

          /System.out.println("Peek element is = " + ge.peek());
         }*/
}
