package constructors;

public class Car {
	
    // this is static variable so it can be accessed through the class name 
    public static int p;  

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

	 this.h=h;
	 this.p=x;

     }
	
      public void getWorld() {
	 System.out.println("Hello world");
      }
}
