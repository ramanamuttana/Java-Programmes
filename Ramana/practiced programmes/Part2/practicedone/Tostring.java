package practicedone;

public class Tostring {

	public static void main(String[] args) {
		Employees emp=new Employees("Ram","sam");
				System.out.println(emp.toString());

	}

}
class Employees
{
     private String firstname ;
     private String Lastname;
	 public Employees(String firstname,String Lastname)
	{
		this.firstname=firstname;
		this.Lastname=Lastname;
		
	}
	 public String toString()
	 {
		 return "Employee["+this.firstname+" "+this.Lastname+"]";
	 }
}
