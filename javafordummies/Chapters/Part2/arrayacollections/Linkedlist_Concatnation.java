package arrayacollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist_Concatnation {

		public static void main(String[] args) {
			List<String> a=new LinkedList<String>();
			a.add("sam");
			a.add("kumar");
			a.add("reddy");
			
			List<String> b=new LinkedList<String>();
			b.add("japan");
			b.add("singapore");
			
			// iteration
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
			// concatnation 
			while (bIter.hasNext()) {
                         aiter.add(bIter.next());
			}
			}
			System.out.println(a+"   ");
                             }		
		}
	}
