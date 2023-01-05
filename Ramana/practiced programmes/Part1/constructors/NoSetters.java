package constructors;

public class NoSetters {

	public static void main(String[] args) {
		Databses dbs = new Databses(10, 20);
		System.out.println("One value is: " + dbs.getX() + " the other value is: " + dbs.getY());
	}
}

/*
 * when there are no setter methods then it will be difficult to modify the values 
 * ONly the case the possible is if all members are public including variables .
 * 
 */

class Databses {
	private int x, y;

	public Databses() {
	}

	public Databses(int x) {
		this.x = x;
	}

	public Databses(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
