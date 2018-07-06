package collections;

public class Pineapple 
{
private int year;
private int month;
private int date;

public Pineapple(int yearofbirth,int birthmonth,int dateborn)
    {
	year=yearofbirth;
	month=birthmonth;
	date=dateborn;
	}
//the format to return to Orange class	
public String toString()
    {
	return String.format("%d %d %d", year,month,date);
	} 

}
