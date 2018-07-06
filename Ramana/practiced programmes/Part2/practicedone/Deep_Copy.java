package practicedone;

public class Deep_Copy {

	public static void main(String[] args)
	{
		Custo cus1= new Custo("ram","sam");
		cus1.setSalary(40000);
		cus1.address=new Address("1300 n.Firststreet","freson","CA","93704");
		Custo cus2=(Custo)cus1.Clone();
		System.out.println("after cloning done we have ");
		printCusto(cus1);
		printCusto(cus2);
	}
	private static void printCusto(Custo r)
	{
		System.out.println(r.getFirstname()+"  "+r.getlasttname());
		System.out.println(r.address.getAddress());
		System.out.println("Salary:"+r.getSalary());
		System.out.println();
	}
}
class Custo implements Cloneable
{
	private  String Firstname;
	private  String lastname;
	private int Salary;
	public Address address;
	
	public Custo(String Firstname,String lastname)
	{
		this.Firstname=Firstname;
		this.lastname=lastname;
		this.address=new Address();
	}
	public String getFirstname()
	{
		return this.Firstname;
	}
	public void setFirstname(String Firstname)
	{
		this.Firstname=Firstname;
	}
	public int getSalary()
	{
		return this.Salary;
	}
	public void setSalary(int i)
	{
		this.Salary=i;
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
		Custo cus;
		try
		{
			cus=(Custo)super.clone();
			cus.address=(Address)address.clone();
		}catch(CloneNotSupportedException e)
		{
			return null;
		}
		return cus;	
	}
	public String toString()
	{
		return this.Firstname+"  "+this.lastname+" "+this.Salary;
	}
}
class Address implements Cloneable
{
	private String Street;
	private String City;
	private String State;
	private String Pincode;
	public Address()
	{
		this.Street="";
		this.City="";
		this.State="";
		this.Pincode="";
	}
	public Address(String Street,String City,String State,String Pincode)
	{
		this.Street=Street;
		this.City=City;
		this.State=State;
		this.Pincode=Pincode;
	}
	public Object clone()
	{
		try{
			return super.clone();
		}catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
	public String getAddress()
	{
		return this.Street+" \n"+this.City+" "+this.State+" "+this.Pincode;
	}
	
}
