package constructors;

public class Car {
	

	public static int p;  // this is static variable so can accessed through class name 

	/**
	 * default constructor will be there but when we write a constructor with an 
	 * arguement then the default constructor will not be there.
	 */
	public Car() {

	}

	public Car(int x) {
		this.p = x;
	}

	public Car(int h, int x) {

	}
}
