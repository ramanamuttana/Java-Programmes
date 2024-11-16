package constructors;

public class Car2 extends Car {
	
	/*
	 * since we are extending the car class , the variables and methods in the car can now  accessed through Object of car
	 * now to call a method we can call through Object , but if it having STATIC then we can call it  through CLASSNAME 
	 * but , here the variable  is in within the class and also STATIC  , so we can call directly  variable p 
	 * 
	 */
	
	public void getWorld() {
		System.out.println("Hello world car2");
	}

	public static void main(String[] args) {
		Car cga =  new Car(10);
		cga.getWorld();
		Car2 cga2 =  new Car2();
		cga2.getWorld();
		
		System.out.println(p); 
	}
}
