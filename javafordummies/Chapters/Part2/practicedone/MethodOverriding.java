package practicedone;

public class MethodOverriding {

	public static void main(String[] args)
	{
	   Employee emp1=new Employee("ram","sam");
	   Employee emp2=new Employee("r","sam");
	   if(emp1.equals(emp2))
	   {
		   System.out.println(("These are Equal"));
		   
	   }else
	   {
		   System.out.println(("These are  not Equal"));
	   }
	   
	}
}
class Employee
{
	private String Firstname;
	private String lastname;
	
	public Employee(String Firstname, String lastname)
	{
		this.Firstname=Firstname;
		this.lastname=lastname;
	}
	public String getFirstname()
	{
		return this.Firstname;
	}
	public String getlasttname()
	{
		return this.lastname;
	}
	public boolean equals(Object obj)
	{
		//objects comparison Employee is equal to  Employee 
		if(this==obj)
			return true;
		
		if(!(obj instanceof Employee))
			return false;
		//casting of Objects 
	   //if(this.getClass()!=obj.getClass());
	   //return false;
	   Employee emp=(Employee) obj ;
	//when we call this method return both equals or not 
	 return this.Firstname.equals(emp.getFirstname())
             &&  this.lastname.equals(emp.getlasttname());
    }
}
