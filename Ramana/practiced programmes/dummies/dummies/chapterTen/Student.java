package dummies.chapterTen;

import java.text.DecimalFormat;

public class Student{
	
	private String subject;
	private int marks;
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getSubjectName(){
		return subject;
	}
	
	public int getSubjectMarks() {
		return marks;
	}
	
	public String getAverageString() {
		DecimalFormat decFormat=new DecimalFormat();
		decFormat.setMaximumFractionDigits(0);
		decFormat.setMaximumFractionDigits(3);
		decFormat.setMinimumFractionDigits(3);
		return decFormat.format(marks);
	}
}
