package constructors;

public class ConstructorwithDefaultandParameters {

	int x, y;

	// empty constructor 
	public DefaultandParametersConst() {

	}

	//constructor with arguements 
	public DefaultandParametersConst(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	/*
	 * when no setters , if the variables are private then only READ possible , no update on the values 
	 */

	public static void main(String[] args) {
		
		// default constructor using setters to set the values 
		DefaultandParametersConst def3=new DefaultandParametersConst();
		def3.setX(10);
		def3.setY(20);
		System.out.println(def3.getX());
		System.out.println(def3.getY());
		// constructor with parameters are used directly to set the values 
		DefaultandParametersConst def4= new DefaultandParametersConst(30,40);
		System.out.println(def4.getX());
		System.out.println(def4.getY());
	}
}
