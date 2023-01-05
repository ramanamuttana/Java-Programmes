package org.override;
class overload
{
	int q;
	char de;
	String def;
	overload()
	{
		this.q=0;
		System.out.println(+q);
	}
	overload(int x)
	{
		this.q=x;
		System.out.println(+q);
	}
	overload(char de)
	{
		this.de=de;
		System.out.println(de);
	}
	/*
	 * in for loop if there is no brackets , then next line will be taken as inside loop 
	 */
	overload(int a, String s)
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
		overload ob2=new overload(100);
		overload ob3=new overload('H');
		overload ob4=new overload(10, "hello");
		
	}

}
