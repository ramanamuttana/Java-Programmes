package constructors;

public class Default {

	public static void main(String[] args) {
		Databses dbs = new Databses(10, 20);
		System.out.println("One value is: " + dbs.getX() + " the other value is: " + dbs.getY());
	}
}

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
