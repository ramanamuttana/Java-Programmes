package practicedone;

public class Get_Set {
	private static int health;
	
	public static int getHealth()
	{
		return health;
	}
	public void setHealth(int h)
	{
	     health = h;
	}

	public static void main(String[] args) {
	
     Get_Set gg= new Get_Set();
     gg.setHealth(10);
     System.out.println(health);
	}

}
