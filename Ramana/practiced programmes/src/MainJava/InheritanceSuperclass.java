package MainJava;
class superclass
{
	int a;
	superclass()
	{
		a=100;
	}
public void disp()
	{
		System.out.println(+a);
	}
}

class subclass extends superclass
{
	int a;
	subclass(int x)
	{
		this.a=x;
	}
public void disp()
	{
	   super.disp();
		System.out.println(+a);
	}	
}
public class InheritanceSuperclass {

	public static void main(String[] args) {
		subclass ob=new subclass(500);
		ob.disp();
	}

}
