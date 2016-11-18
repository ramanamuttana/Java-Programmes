package practicedone;
 class Deep
 {
	
	int x,y;
 }
class  DeepCopy implements Cloneable
    {
	public int a,b;
	
	 Deep c=new Deep();
	
	public Object clone() throws CloneNotSupportedException
	{
		DeepCopy t=(DeepCopy)super.clone();
		t.c=new Deep();
		return t;
	}
	
	public static void main(String[] args) 
	{
		DeepCopy t1=new DeepCopy();
		 t1.a = 10;
	       t1.b = 20;
	       t1.c.x = 30;
	       t1.c.y = 40;
	       // Change in object type field of t2 will not
	       // be reflected in t1(deep copy)
	       System.out.println(t1.a + " " + t1.b + " " +
	                          t1.c.x + " " + t1.c.y);

	}

}
