package org.overload;
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
public class Overloadprogramm {

	public static void main(String[] args) {
		Car ob=new Car();
		Car ob2=new Car(100);
		Car ob3=new Car('H');
		Car ob4=new Car(10, "hello");
		
	}

}
