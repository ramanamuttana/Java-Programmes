package collections;

public class Oranges 
{

	private String name;
	private Pineapple date;
	//creating constructor and getting the values from Pineapple class
	public Oranges(String membername,Pineapple birthday)
	{
		name=membername;
		date=birthday;
	}
	public String toString()
	{
		return String.format("Employee name is %s and Employee birthday is %s", name,date);
	}
}
