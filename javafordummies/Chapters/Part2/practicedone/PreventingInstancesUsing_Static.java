package practicedone;

public final class PreventingInstancesUsing_Static {
	static int x=10;
	private PreventingInstancesUsing_Static()
	{
		
	}
	public static int readers()
	{
	  return x; 
	}

	public static void main(String[] args) 
	{	
	
    System.out.println(readers());
	}

}
