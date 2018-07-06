package MainJava;
class overload
{
	int q;
	char de;
	String def;
	void overload()
	{
		this.q=0;
		System.out.println(+q);
	}
	void overload(int x)
	{
		this.q=x;
		System.out.println(+q);
	}
	void overload(char de)
	{
		
		System.out.println(de);
	}
	void overload(int a, String s)
	{
		this.q=a;
		this.def=s;
		for(int i=1;i<=3;i++)
		System.out.println(def);
	}
	
}
public class Overridingprogramm {

	public static void main(String[] args) {
		overload ob=new overload();
		ob.overload();
		ob.overload(100);
		ob.overload('H');
		ob.overload(10, "hello");
		

	}

}
