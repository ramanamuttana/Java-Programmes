package org.critical.problems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateformat {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat simpleInput= new SimpleDateFormat("dd/mm/yyyy G");
		SimpleDateFormat simpleOutput= new SimpleDateFormat("yyyy.mm.dd G");

		// extract 
		Date date=simpleInput.parse("35/02/2016 AD");
		System.out.println(date);

		// format 
		String output=simpleOutput.format(date);
		System.out.println(output);
	}

}
