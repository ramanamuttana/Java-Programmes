package arrayacollections;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        /*
	* GregorianCalenda should implement comparable Interface or else priorityQueue 
	*  should have ((d1, d2) -> d1.compareTo(d2)) in its constructor 
        * when you want the order in revers order then it should be (Collections.reverseOrder()) in the constructor 
	* PriorityQueue<>(Collections.reverseOrder()); then output would be #Output2 check below 
	*/
        Queue<GregorianCalendar> pq = new PriorityQueue<>((d1, d2) -> d1.compareTo(d2));

        pq.add(new GregorianCalendar(1907, Calendar.DECEMBER, 9));
        pq.add(new GregorianCalendar(1906, Calendar.MARCH, 16));
        pq.add(new GregorianCalendar(1957, Calendar.FEBRUARY, 19));
        pq.add(new GregorianCalendar(1909, Calendar.JANUARY, 29));
        pq.add(new GregorianCalendar(1807, Calendar.FEBRUARY, 19));

        // Iterating using removal to maintain priority order
        while (!pq.isEmpty()) {
            GregorianCalendar date = pq.remove();
            System.out.println(date.get(Calendar.YEAR) + "-" + (date.get(Calendar.MONTH) + 1) + "-" + date.get(Calendar.DAY_OF_MONTH));
        }
    }
}

/* output:
* 1807-2-19
* 1906-3-16
* 1907-12-9
* 1909-1-29
* 1957-2-19
*/

/* output2:
* 1957-2-19
* 1909-1-29
* 1907-12-9
* 1906-3-16
* 1807-2-19 
*/

