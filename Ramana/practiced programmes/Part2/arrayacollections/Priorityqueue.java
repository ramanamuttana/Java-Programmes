package arrayacollections;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue {

	public static void main(String[] args) {

				Queue<GregorianCalendar> pq = new PriorityQueue<>();
				pq.add(new GregorianCalendar(1907,Calendar.DECEMBER,9));
				pq.add(new GregorianCalendar(1906,Calendar.MARCH,16));
				pq.add(new GregorianCalendar(1957,Calendar.FEBRUARY,19));
				pq.add(new GregorianCalendar(1909,Calendar.JANUARY,29));
				pq.add(new GregorianCalendar(1807,Calendar.FEBRUARY,19));
				
				for(GregorianCalendar date:pq)
				{
					System.out.println(date.get(Calendar.YEAR));
					
				}
				/*while(!pq.isEmpty())
				{
					System.out.println(pq.remove().get(Calendar.DATE));
				}*/

			}

	}
