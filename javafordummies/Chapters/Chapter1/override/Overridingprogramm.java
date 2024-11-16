package org.override;
class Car{
	int q;
	char de;
	String def;
	Car()
	{
		this.q=0;
		System.out.println(+q);
	}
	Car(int x)
	{
		this.q=x;
		System.out.println(+q);
	}
	Car(char de)
	{
		this.de=de;
		System.out.println(de);
	}
	/*
	 * in for loop if there is no brackets , then next line will be taken as inside loop 
	 */
	Car(int a, String s){
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
