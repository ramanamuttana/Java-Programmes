package org.inheritance;
 class abc {
	int a;
	void disp()
	{
		a=100;
		System.out.println(+a); // Prints: 100
	}
}
 class def extends abc{
	int s;
	void disp2()
	{
		s=200;
		disp();
		System.out.println(+s);
	}
	
}
public class TestDemo {

	public static void main(String[] args) {
		def ob=new def();
		ob.disp2();
	}

}
