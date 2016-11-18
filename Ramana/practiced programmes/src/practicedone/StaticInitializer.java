package practicedone;

public class StaticInitializer {
	//Here the Modifier should be public or private  
	private static int x;
	//This will execute first before the constructor 
	static 
	{
	 x=10;
	}
	public static int reader()
	{
	  return x; 
	}

	public static void main(String[] args) {
		
         System.out.println(reader());
	}

}
