package practicedone;

public class CloneObjects {

	public static void main(String[] args)
	{
		Customer cus1= new Customer("ram","sam");
		Customer cus2=(Customer)cus1.Clone();
		cus1.setFirstname("samssss");
		System.out.println(cus1);
		System.out.println(cus2);
	}
}
class Customer
{
	private  String Firstname;
	private  String lastname;
	
	public Customer(String Firstname,String lastname)
	{
		this.Firstname=Firstname;
		this.lastname=lastname;
	}
	public String getFirstname()
	{
		return this.Firstname;
	}
	public void setFirstname(String Firstname)
	{
		this.Firstname=Firstname;
	}
	public String getlasttname()
	{
		return this.lastname;
	}
	public void setlastname(String lastname)
	{
		this.lastname=lastname;
	}
	public Object Clone()
	{
		Customer cus=new Customer(this.Firstname,this.lastname);
		return cus;	
	}
	public String toString()
	{
		return this.Firstname+"  "+this.lastname;
	}
}

