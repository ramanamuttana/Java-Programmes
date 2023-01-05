package constructors;

public class Car {
	

	public static int p;  // this is static variable so it can be accessed through class name 

	/**
	 * default constructor will be there but when we write a constructor with an 
	 * arguement then the default constructor will not be there.
	 * incase if we want the default constructor , then we need to type manually .
	 */
	public Car() {

	}

	public Car(int x) {
		this.p = x;
	}

	public Car(int h, int x) {

	}
	
	public void getWorld() {
		System.out.println("Hello world");
	}
}
