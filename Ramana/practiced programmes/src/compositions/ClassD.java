package compositions;

public class ClassD 
{
	public static void testing()
	{
		System.out.println("class D is running");
	}
	//diamond solution problem analysis
	public  static void main(String[]args)
	{
		ClassB b=new ClassB();

		ClassC c=new ClassC();
		b.test();
		testing();
	}
}
