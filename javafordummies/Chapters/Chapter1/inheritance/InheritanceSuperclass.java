package org.inheritance;
class superclass
{
	int a;
	superclass()
	{
		a=100;
	}
public void disp()
	{
		System.out.println(+a);
	}
}

class subclass extends superclass
{
	int a;
	subclass(int x)
	{
		this.a=x;
	}
public void disp()
	{
	   super.disp();
		System.out.println(+a);
	}	
}

/*
 * 1) subclass will initialize the superclass also and will the call the method
 * 2) the subclass first prefernce is subclass methods only .
 * 3) incase in subclass does not exist , then super class method will be called directly .
 */
public class InheritanceSuperclass {

	public static void main(String[] args) {
		subclass ob=new subclass(500);
		ob.disp();
	}

}
