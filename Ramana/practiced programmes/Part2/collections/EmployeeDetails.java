package collections;

public class EmployeeDetails 
{

	private String name;
	private EmployeeDoB date;
	//creating constructor and getting the values from Pineapple class
	public EmployeeDetails(String membername,EmployeeDoB birthday)
	{
		name=membername;
		date=birthday;
	}
	public String toString()
	{
		return String.format("Employee name is %s and Employee birthday is %s", name,date);
	}
}
