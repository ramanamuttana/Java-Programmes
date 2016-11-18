package practicedone;

 abstract class Somewaysone
{
	int Id;
	String name;
	double salary;
	public void employee(int a,String abs,double pq)
	{
		this.Id=a;
		this.name=abs;
		this.salary=pq;
		System.out.println(Id+" "+name+" "+salary);
		
	}
}
class Someways extends  Somewaysone
{
	int Id;
	String name;
	double salary;
	String dept;
	public void employee(int a,String abs,double pq,String dep)
	{
		this.Id=a;
		this.name=abs;
		this.salary=pq;
		this.dept=dep;
		System.out.println(Id+" "+name+" "+dept+" "+salary);
		
	}
}

 public class Abstractway 
{
	public static void main(String[]args)
	{	
		//Somewaysone obj2= new Somewaysone();
		Someways obj=new Someways();
		obj.employee(200, "ganesha", 12.0);
		obj.employee(100, "ramana", 4.0, "cse");
		
	}
	
}