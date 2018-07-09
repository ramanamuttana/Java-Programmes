package Generics;
import java.util.*;

public class Generics<E> {
	
	private LinkedList<E> list=new LinkedList<E> ();
	
	E item;
	public void push(E item)
	{
		list.addFirst(item);
	}
	public E pop(E item)
	{
	   return list.poll();
	}
	public E peek(E item)
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
	

}
