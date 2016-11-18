package practicedone;

public class CratingInstancesCount {

	public static void main(String[] args) {
     printCount();
     for(int i=0;i<=10;i++)
     {
    	 demosession obj=new demosession();
    	 printCount();
     }
	}
	public static void   printCount()
	{
		System.out.println("The total number of stack Rotate:"+demosession.getInstanceCount());
	}
}
	class demosession
	{
		private static int x=0;
		
		public demosession()
		{
			x++;
		}
		public static int getInstanceCount()
		{
			return x;
		}
	}
