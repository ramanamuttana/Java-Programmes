package Arrayacollections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.*;

public class Linkedlist_Concatnation {

		public static void main(String[] args) {
			List<String> a=new LinkedList<String>();
			a.add("Venkata");
			a.add("Ramana");
			a.add("reddy");
			
			List<String> b=new LinkedList<String>();
			b.add("Muttana");
			b.add("Gogulapadu");
			
			ListIterator<String> aiter=a.listIterator();
			Iterator<String> bIter=b.iterator();
			while(aiter.hasNext()){
				if(aiter.hasNext())aiter.next();
				//aiter.add(bIter.next());
				
			}
			while(bIter.hasNext()){
				if(bIter.hasNext())bIter.next();
				//aiter.add(bIter.next());
				
			}
			System.out.println(a+"   "+b);
			
			
			
			
		}

	}
