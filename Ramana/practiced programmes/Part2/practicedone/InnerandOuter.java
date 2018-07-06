package practicedone;

class outer 
    {
	int x=243;
	int y=343;
	public void showcase()
	{
		System.out.println("hello");
	inner zom= new inner();
	inner.show();
	}
static class inner
    {
	  static int z=1000;
	 static int b=999;
	 static void show()
	{
		System.out.println(z+b);
	}
    }	
    }

public class InnerandOuter {

	public static void main(String[] args)
	{
	outer zome= new outer();
	zome.showcase();

	}

}
