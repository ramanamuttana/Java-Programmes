package chapterten.exampleone;

import java.text.DecimalFormat;

public class StudentExtension {
	
	public static void main(String args[ ]) {
	Student ramesh=new Student();
	ramesh.setSubject("Telugu");
	ramesh.setMarks(89);
	Student venkatesh= new Student();
	venkatesh.setSubject("Telugu");
	venkatesh.setMarks(86);

	System.out.println("ramesh marks : "+ramesh.getSubjectMarks());
	System.out.println("Venkatesh Marks : "+venkatesh.getSubjectMarks());
	
	}
}
