package constructors;

public class Default {

	
	public static void main(String[]args)
	{
		 databses dbs= new databses(10,20);
	
	}
}
	class databses
	{
		private int x, y;
		public databses()
		{	
		}
		public databses(int x)
		{
			this.x=x;
		}
		public databses(int x,int y)
		{
			this.x=x;
			this.y=y;
		}
	}

