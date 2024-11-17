package practicedone;

public class CratingInstancesCount {

	public static void main(String[] args) {
                  printCount();
                for(int i=0;i<=10;i++){
    	            Demosession obj=new Demosession();
    	            printCount();
               }
	}
	
	public static void   printCount()
	{
		System.out.println("The total number of stack Rotate:"+Demosession.getInstanceCount());
	}
}
	class Demosession
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
