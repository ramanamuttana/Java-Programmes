package org.timerelated;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class GenerateTimePeriodForZone {
	
	public static void main(String args[ ]) {
		
		GenerateTimePeriodForZone generateTimePeriod=new GenerateTimePeriodForZone();
		generateTimePeriod.getTimePeriod(12);
	}

	private void getTimePeriod(int hours) {
		String[ ] time=new String[hours ];
		Date presentTimeandDate=new Date();
		Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Europe/Berlin"));
		c.setTime(presentTimeandDate); // add present time 
		c.add(Calendar.HOUR, -hours);  // from the present time subtract the number of hours 
		System.out.println(c.getTime()+" Time");
		System.out.println(-hours+"  the required minus hours");
    	for(int i=0;i<hours;i++) {
    		c.add(Calendar.HOUR, 1); // start one hour after reduction of the hours 
    		Date date=c.getTime();
    		SimpleDateFormat dateFormat=new SimpleDateFormat("HH:mm"); // required format 
    		String dateString =dateFormat.format(date);
    		time[i] =dateString;
    		System.out.println(time[i]+ " the time required"); // print the values 
    	}
	}
}
/*
 * 1)initially get the present time 2) then reduce the some number of hours from
 * the present time 3) then start add 1 or some hours to it and them add to
 * String array 4) rotate number of times to get the required timings 5)
 * simpledateformat is required to get kind of format
 */
